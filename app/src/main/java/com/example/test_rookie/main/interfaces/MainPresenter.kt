package com.example.test_rookie.main.interfaces

import com.example.test_rookie.main.entities.Cell

interface MainPresenter {
    fun createCell(cellList: MutableList<Cell>)
}