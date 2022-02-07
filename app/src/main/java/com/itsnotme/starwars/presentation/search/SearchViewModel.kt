package com.itsnotme.starwars.presentation.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsnotme.starwars.data.person.cloud.PersonCloudModel
import com.itsnotme.starwars.domain.repository.PersonRepository
import com.itsnotme.starwars.other.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val repository: PersonRepository) : ViewModel() {
    private val _personList = MutableLiveData<List<PersonCloudModel>>()
    val personList = _personList.asLiveData()

    fun fetchPersons() {
        viewModelScope.launch {
            val resp = repository.getPersonListFromNet("ha")
            _personList.value = resp.results
        }
    }
}