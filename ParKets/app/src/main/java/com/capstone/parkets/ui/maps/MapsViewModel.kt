package com.capstone.parkets.ui.maps

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.capstone.parkets.data.ParkRepository
import com.capstone.parkets.preference.UserModel
import com.capstone.parkets.preference.UserPreference

class MapsViewModel(private val pref: UserPreference, private val parkRepository: ParkRepository) : ViewModel() {

    fun getToken(): LiveData<UserModel> {
        return pref.getToken().asLiveData()
    }
}