package com.example.test_rookie.main.interfaces

import com.example.test_rookie.main.entities.Cell

interface MainModel {
    fun getCells(cellList: MutableList<Cell>) : MutableList<Cell>
}