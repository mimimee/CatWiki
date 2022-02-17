package com.itsnotme.catwiki.presentation.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsnotme.catwiki.data.fact.cloud.FactCloudModel
import com.itsnotme.catwiki.domain.repository.FactRepository
import com.itsnotme.catwiki.other.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: FactRepository
) : ViewModel() {
    private val searchDelay = 1000L
    private var searchJob: Job? = null

    private val _factList = MutableLiveData<List<FactCloudModel>>()
    val factList = _factList.asLiveData()

    fun fetchFacts(searchText: String) {
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            delay(searchDelay)
            try {

            } catch (e: Exception) {
                handleSearchException(e)
            }
        }
    }

    private fun handleSearchException(e: Exception) {

    }
}