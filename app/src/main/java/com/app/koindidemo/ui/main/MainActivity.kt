package com.app.koindidemo.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.koindidemo.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = get()

        text_view_demo.text = mainViewModel.getUserName()
    }
}