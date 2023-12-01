package com.artpit.android.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.artpit.android.dependencyinjectionstart.R
import com.artpit.android.dependencyinjectionstart.example1.Activity

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ExampleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        viewModel.method()
    }
}