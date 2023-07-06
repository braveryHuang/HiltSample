package com.braveryhuang.kotlinhiltsample.model

import android.util.Log
import javax.inject.Inject

class GasEngine @Inject constructor() : Engine {
    private val TAG = "GasEngine"

    override fun start() {
        Log.i(TAG, "start: GasEngine")
    }

    override fun stop() {
        Log.i(TAG, "stop: GasEngine")
    }
}