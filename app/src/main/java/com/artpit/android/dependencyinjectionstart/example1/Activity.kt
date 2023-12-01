package com.artpit.android.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    @Inject
    lateinit var computer: Computer

//    @Inject
//    lateinit var keyboard: Keyboard
//    @Inject
//    lateinit var mouse: Mouse
//    @Inject
//    lateinit var monitor: Monitor

    init {
        //Component().inject(this)
        DaggerNewComponent.create().inject(this)
    }
}

//class Activity {
//    private val component = DaggerNewComponent.create()
//    var keyboard = component.getKeyboard()
//    var mouse = component.getMouse()
//    var monitor = component.getMonitor()
//}