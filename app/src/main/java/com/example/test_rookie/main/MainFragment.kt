package com.example.test_rookie.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.test_rookie.R
import com.example.test_rookie.databinding.FragmentMainBinding
import com.example.test_rookie.main.entities.Cell
import com.example.test_rookie.main.interfaces.MainView
import com.example.test_rookie.main.presenters.MainFragmentPresenter
import com.example.test_rookie.main.recycler.MainAdapter

class MainFragment : Fragment(R.layout.fragment_main), MainView {

    private lateinit var binding : FragmentMainBinding

    private var cellList : MutableList<Cell> = mutableListOf()

    private lateinit var mainAdapter : MainAdapter
    private val mainFragmentPresenter = MainFragmentPresenter(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        buttonListeners()
    }

    private fun buttonListeners() {
        binding.createBtn.setOnClickListener {
            mainFragmentPresenter.createCell(cellList)
        }
    }

    override fun createCell(cellList: MutableList<Cell>) {
        this.cellList = cellList
        mainAdapter = MainAdapter()
        mainAdapter.cellList = this.cellList
        binding.mainRecycler.adapter = mainAdapter
        binding.mainRecycler.scrollToPosition(mainAdapter.itemCount - 1)
    }

}