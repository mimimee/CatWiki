package com.itsnotme.starwars.presentation.base

sealed class Result {
    class Success<T>(value: T) : Result()
    class Error(e: Exception) : Result()
}