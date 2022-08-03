package io.submission.indonesiansatay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSatay : RecyclerView
    private var list : ArrayList<Sate> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSatay =findViewById(R.id.rv_satayTypes)
        rvSatay.setHasFixedSize(true)

        list.addAll(SatayData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSatay.layoutManager = LinearLayoutManager(this)
        val listAdapter = AdapterListSatay(list, onClick = {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(SecondActivity.EXTRA_TITLE, it.name)
            intent.putExtra(SecondActivity.EXTRA_PHOTO, it.photo)
            intent.putExtra(SecondActivity.EXTRA_DETAIL, it.detail)
            startActivity(intent)
        })
        rvSatay.adapter = listAdapter
    }

    // TODO: Make Menu on Action Bar

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        return when (item.itemId) {
            R.id.about_button -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}