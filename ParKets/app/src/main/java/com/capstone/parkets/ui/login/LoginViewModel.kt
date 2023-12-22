package com.capstone.parkets.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.capstone.parkets.data.ParkRepository
import com.capstone.parkets.preference.UserPreference

class LoginViewModel(private val pref: UserPreference, private val storyRepository: ParkRepository) : ViewModel() {
    val loading : MutableLiveData<Boolean> = storyRepository.loadRepo

    fun loginRepo(email: String, password: String) = storyRepository.login(email, password, pref)
}