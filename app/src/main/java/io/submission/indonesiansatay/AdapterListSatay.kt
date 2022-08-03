package io.submission.indonesiansatay

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class AdapterListSatay(private val listSate : ArrayList<Sate>, private val onClick: (Sate)->Unit) : RecyclerView.Adapter<AdapterListSatay.ListViewHolder>(){
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.satay_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_view)
        var tvDetail: TextView = itemView.findViewById(R.id.satay_detail)
        var actionLayout: LinearLayout = itemView.findViewById(R.id.row_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.rowlayout, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val sate = listSate[position]
        holder.tvName.text = sate.name
        holder.imgPhoto.setImageResource(sate.photo)
        holder.tvDetail.text = sate.detail

        holder.actionLayout.setOnClickListener{
            onClick(sate)
        }
    }

    override fun getItemCount(): Int {
        return listSate.size
    }
}