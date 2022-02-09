package com.itsnotme.starwars.presentation.search

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.itsnotme.starwars.databinding.FragmentSearchBinding
import com.itsnotme.starwars.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    private val viewModel: SearchViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.personList.observe(viewLifecycleOwner) {
            Log.d("kek", it.size.toString() + " FROM FRAGMENT")
        }

        binding.root.setOnClickListener {
            viewModel.fetchPersons("ha")
        }
    }
}