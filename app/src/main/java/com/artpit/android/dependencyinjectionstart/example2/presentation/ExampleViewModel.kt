package com.artpit.android.dependencyinjectionstart.example2.presentation

import com.artpit.android.dependencyinjectionstart.example2.domain.ExampleUseCase

class ExampleViewModel(private val useCase: ExampleUseCase) {
    fun method() {
        useCase()
    }
}