package com.example.test_rookie.main.interfaces

import com.example.test_rookie.main.entities.Cell

interface MainView {
    fun createCell(cellList : MutableList<Cell>)
}