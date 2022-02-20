package com.itsnotme.catwiki.presentation.search

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.itsnotme.catwiki.databinding.FragmentSearchBinding
import com.itsnotme.catwiki.presentation.base.BaseFragment
import com.itsnotme.catwiki.presentation.base.Result
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    private val viewModel: SearchViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.factList.observe(viewLifecycleOwner) {
            when (it) {
                Result.InProgress -> Log.d("kek", "Loading...")
                is Result.Error -> Log.d("kek", "Error ${it.e.message}")
                is Result.Success -> Log.d("kek", "Result ${it.data}")
            }
        }

        binding.root.setOnClickListener {
            viewModel.fetchFacts()
        }
    }
}