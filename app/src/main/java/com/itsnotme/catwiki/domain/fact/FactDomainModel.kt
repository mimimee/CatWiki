package com.itsnotme.catwiki.domain.fact

data class FactDomainModel(
    private val id: String,
    private val text: String,
    private val updatedAt: String,
    private val sentCount: Int
)