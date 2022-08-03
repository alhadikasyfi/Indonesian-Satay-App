package io.submission.indonesiansatay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)

        val tvTitle : TextView = findViewById(R.id.tv_mainTitle)
        val ivPhoto : ImageView = findViewById(R.id.mainimageView)
        val tvDetail : TextView = findViewById(R.id.tv_detail)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvTitle.text = title
        ivPhoto.setImageResource(photo)
        tvDetail.text = detail

        println(title)
        println(detail)

    }
}