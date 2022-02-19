package com.itsnotme.catwiki.presentation.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsnotme.catwiki.data.fact.cloud.FactCloudModel
import com.itsnotme.catwiki.domain.repository.FactRepository
import com.itsnotme.catwiki.other.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val repository: FactRepository) : ViewModel() {

    private val _factList = MutableLiveData<List<FactCloudModel>>()
    val factList = _factList.asLiveData()

    fun fetchFacts() {
        viewModelScope.launch {
            try {
//                _factList.value = resp
            } catch (e: Exception) {
                handleSearchException(e)
            }
        }
    }

    private fun handleSearchException(e: Exception) {

    }
}