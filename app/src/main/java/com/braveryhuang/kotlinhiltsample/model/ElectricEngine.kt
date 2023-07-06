package com.braveryhuang.kotlinhiltsample.model

import android.util.Log
import javax.inject.Inject


class ElectricEngine @Inject constructor() : Engine {
    private val TAG = "ElectricEngine"

    override fun start() {
        Log.i(TAG, "start: ElectricEngine")
    }

    override fun stop() {
        Log.i(TAG, "stop: ElectricEngine")
    }
}