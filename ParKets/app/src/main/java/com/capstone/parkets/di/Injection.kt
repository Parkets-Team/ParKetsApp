package com.capstone.parkets.di

import android.content.Context
import com.capstone.parkets.data.ParkRepository
import com.capstone.parkets.data.local.room.StoryDatabase

object Injection {
    fun provideRepository(context: Context): ParkRepository {
        val database = StoryDatabase.getDatabase(context)
        val apiService = ApiConfig.getApiService()
        return ParkRepository(database, apiService)
    }
}