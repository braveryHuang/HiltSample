package com.braveryhuang.kotlinhiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.braveryhuang.kotlinhiltsample.model.Truck
import com.braveryhuang.kotlinhiltsample.model.TruckWithParam
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var truckWithParam: TruckWithParam

    @Inject
    lateinit var okHttpClient: OkHttpClient

    @Inject
    lateinit var okHttpClient2: OkHttpClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        truck.deliver()
        truckWithParam.deliver()
        val timeout = okHttpClient.readTimeoutMillis
        Log.i(TAG, "timeout = $timeout")
        Log.i(TAG, "okhttpEqual = ${okHttpClient == okHttpClient2}")
    }
}