package com.app.koindidemo.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.koindidemo.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view_demo.text = mainViewModel.getUserName()
    }
}