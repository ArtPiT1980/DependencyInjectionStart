package com.artpit.android.dependencyinjectionstart.example1

class Activity {
    lateinit var computer: Computer

    init {
        Component().inject(this)
    }
}