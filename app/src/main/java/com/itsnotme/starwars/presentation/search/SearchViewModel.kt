package com.itsnotme.starwars.presentation.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.domain.repository.PersonRepository
import com.itsnotme.starwars.other.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: PersonRepository
) : ViewModel() {
    private val searchDelay = 1000L
    private var searchJob: Job? = null

    private val _personList = MutableLiveData<List<PersonCloudModel>>()
    val personList = _personList.asLiveData()

    fun fetchPersons(searchText: String) {
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            delay(searchDelay)
            try {
                _personList.value = repository.getPersonListFromNet(searchText).results
            } catch (e: Exception) {
                handleSearchException(e)
            }
        }
    }

    private fun handleSearchException(e: Exception) {

    }
}