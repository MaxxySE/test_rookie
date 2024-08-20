package com.example.test_rookie.main.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test_rookie.R
import com.example.test_rookie.main.entities.Cell

class MainViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

    private val elImage : ImageView = itemView.findViewById(R.id.element_image)
    private val elHeader : TextView = itemView.findViewById(R.id.element_header)
    private val elSub : TextView = itemView.findViewById(R.id.element_sub)

    fun bind(model : Cell) {

        elImage.setImageResource(model.imageUrl)

        elHeader.text = model.headText
        elSub.text = model.subText



    }

}