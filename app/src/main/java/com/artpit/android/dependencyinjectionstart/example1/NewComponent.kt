package com.artpit.android.dependencyinjectionstart.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {
    fun inject(activity: Activity)

//    fun getKeyboard(): Keyboard
//
//    fun getMouse(): Mouse
//
//    fun getMonitor(): Monitor
}