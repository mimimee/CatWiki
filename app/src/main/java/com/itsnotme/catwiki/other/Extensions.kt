package com.itsnotme.catwiki.other

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.asLiveData(): LiveData<T> = this

fun <T, V, R> LiveData<T>.combineWithNotNull(secondLiveData: LiveData<V>, block: (T, V) -> R): LiveData<R> {
    val result = MediatorLiveData<R>()
    result.addSource(this) { first ->
        secondLiveData.value?.let { second ->
            result.value = block(first, second)
        }
    }
    result.addSource(secondLiveData) { second ->
        this.value?.let { first ->
            result.value = block(first, second)
        }
    }
    return result
}