package com.braveryhuang.kotlinhiltsample.model

import android.util.Log
import javax.inject.Inject

class Driver @Inject constructor() {
    private val TAG = "Driver"
    init {
        Log.i(TAG, "driver: created")
    }
}