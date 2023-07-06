package com.braveryhuang.kotlinhiltsample.model

import android.util.Log
import javax.inject.Inject

class TruckWithParam @Inject constructor(val driver: Driver) {
    private val TAG = "TruckWithParam"

    fun deliver() {
        Log.i(TAG, "deliver: test TruckWithParam")
    }
}