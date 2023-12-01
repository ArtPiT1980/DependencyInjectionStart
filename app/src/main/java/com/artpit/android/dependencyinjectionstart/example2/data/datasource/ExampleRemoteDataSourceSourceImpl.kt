package com.artpit.android.dependencyinjectionstart.example2.data.datasource

import com.artpit.android.dependencyinjectionstart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}