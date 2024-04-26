package com.kodeco.android.worldcountriesquiz.database

import kotlinx.coroutines.flow.Flow

interface SettingsPrefs {
    fun getLocalStorageEnabled(): Flow<Boolean>
    fun getReviewCountryEnabled(): Flow<Boolean>
    suspend fun toggleLocalStorage()
    suspend fun toggleReviewCountryFeature()
}