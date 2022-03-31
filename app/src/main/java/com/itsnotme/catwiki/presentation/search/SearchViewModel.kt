package com.itsnotme.catwiki.presentation.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsnotme.catwiki.domain.fact.FactDomainModel
import com.itsnotme.catwiki.domain.fact.GetRandomFactsInteractor
import com.itsnotme.catwiki.other.asLiveData
import com.itsnotme.catwiki.presentation.base.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getRandomFactsInteractor: GetRandomFactsInteractor
) : ViewModel() {

    private val _factList = MutableLiveData<Result<List<FactDomainModel>>>(Result.InProgress)
    val factList = _factList.asLiveData()

    fun fetchFacts() {
        viewModelScope.launch {
            val factsDomain = getRandomFactsInteractor.execute()
            _factList.value = factsDomain
        }
    }
}