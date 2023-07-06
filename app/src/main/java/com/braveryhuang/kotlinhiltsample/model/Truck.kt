package com.braveryhuang.kotlinhiltsample.model

import com.braveryhuang.kotlinhiltsample.di.BindElectricEngine
import com.braveryhuang.kotlinhiltsample.di.BindGasEngine
import javax.inject.Inject

class Truck @Inject constructor() {
    private val TAG = "Truck"

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    fun deliver() {
        gasEngine.start()
        electricEngine.start()
        println("Truck is delivering cargo. Driven by abc")
        gasEngine.stop()
        electricEngine.stop()
    }
}