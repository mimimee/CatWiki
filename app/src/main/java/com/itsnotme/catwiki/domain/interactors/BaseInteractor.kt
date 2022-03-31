package com.itsnotme.catwiki.domain.interactors

import com.itsnotme.catwiki.presentation.base.Result

abstract class BaseInteractor<DomainModel> {
    protected abstract suspend fun fetch(): DomainModel

    suspend fun execute() = try {
        Result.Success(fetch())
    } catch (e: Exception) {
        Result.Error(e)
    }
}