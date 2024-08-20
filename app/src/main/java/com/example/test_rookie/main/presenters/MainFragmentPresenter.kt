package com.example.test_rookie.main.presenters

import com.example.test_rookie.main.entities.Cell
import com.example.test_rookie.main.interfaces.MainPresenter
import com.example.test_rookie.main.interfaces.MainView
import com.example.test_rookie.main.models.MainFragmentModel

class MainFragmentPresenter (
    private val mainView : MainView
        ) : MainPresenter {

    private val mainFragmentModel = MainFragmentModel()

    override fun createCell(cellList: MutableList<Cell>) {
        mainView.createCell(mainFragmentModel.getCells(cellList))
    }

}