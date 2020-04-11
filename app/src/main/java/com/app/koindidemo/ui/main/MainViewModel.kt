package com.app.koindidemo.ui.main

import androidx.lifecycle.ViewModel
import com.app.koindidemo.repository.RemoteRepository

// ViewModel for fetching data from repository.
class MainViewModel(private var remoteRepository: RemoteRepository): ViewModel() {

    fun getUserName(): String {
        return remoteRepository.getUserName()
    }
}