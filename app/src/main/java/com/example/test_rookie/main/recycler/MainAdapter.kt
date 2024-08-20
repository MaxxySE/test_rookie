package com.example.test_rookie.main.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test_rookie.R
import com.example.test_rookie.main.entities.Cell

class MainAdapter : RecyclerView.Adapter<MainViewHolder>() {

    var cellList : MutableList<Cell> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell_view, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount(): Int = cellList.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(cellList[position])
    }


}