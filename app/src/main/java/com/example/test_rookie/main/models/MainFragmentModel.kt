package com.example.test_rookie.main.models

import com.example.test_rookie.R
import com.example.test_rookie.additional.ResourceProvider
import com.example.test_rookie.main.entities.Cell
import com.example.test_rookie.main.interfaces.MainModel
import kotlin.random.Random

class MainFragmentModel : MainModel {

    private var cellList : MutableList<Cell> = mutableListOf()
    private var aliveCount = 0
    private var deadCount = 0

    override fun getCells(cellList: MutableList<Cell>): MutableList<Cell> {

        this.cellList = cellList

        createCell()

        return this.cellList

    }

    private fun addAlive() {
        cellList.add(Cell(R.drawable.alive,
            ResourceProvider.getString(R.string.alive_cell_header),
            ResourceProvider.getString(R.string.alive_cell_sub)))
    }

    private fun addLife() {
        cellList.add(Cell(R.drawable.life,
            ResourceProvider.getString(R.string.life_cell_header),
            ResourceProvider.getString(R.string.life_cell_sub)))
    }

    private fun addDead() {
        cellList.add(Cell(R.drawable.dead,
            ResourceProvider.getString(R.string.dead_cell_header),
            ResourceProvider.getString(R.string.dead_cell_sub)))
    }

    private fun createCell() {
        val isAlive = Random.nextBoolean()

        if(isAlive) {
            aliveCount++
            addAlive()
            deadCount = 0
        } else {
            deadCount++
            addDead()
            aliveCount = 0
        }

        checkCells()

    }

    private fun checkCells() {
        if (aliveCount >= 3) {
            addLife()
            aliveCount = 0
        }

        if (deadCount >= 3) {
            if (cellList.size - 4 >= 0
                &&
                cellList[cellList.size - 4].headText == ResourceProvider.getString(R.string.life_cell_header)){

                cellList[cellList.size - 4] = Cell(
                    R.drawable.dead,
                    ResourceProvider.getString(R.string.dead_cell_header),
                    ResourceProvider.getString(R.string.dead_cell_sub)
                )

            }
            deadCount = 0
        }
    }

}