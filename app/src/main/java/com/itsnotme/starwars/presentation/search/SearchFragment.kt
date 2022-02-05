package com.itsnotme.starwars.presentation.search

import android.os.Bundle
import android.view.View
import com.itsnotme.starwars.data.net.StarWarsApiService
import com.itsnotme.starwars.databinding.FragmentSearchBinding
import com.itsnotme.starwars.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {

    @Inject
    lateinit var api: StarWarsApiService

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}