package com.app.koindidemo.di

import com.app.koindidemo.repository.RemoteRepository
import com.app.koindidemo.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    single {
        RemoteRepository()
    }
    viewModel {
        MainViewModel(get())
    }
}