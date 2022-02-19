package com.itsnotme.catwiki.presentation.base

//sealed class Result {
//    class Success<T>(value: T) : Result()
//    class Error(e: Exception) : Result()
//}

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val e: Exception) : Result<Nothing>()
    object InProgress : Result<Nothing>()
}