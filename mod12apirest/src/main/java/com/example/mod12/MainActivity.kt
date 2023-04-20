package com.example.mod12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.*
import java.io.IOException

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("https://api.open-meteo.com/v1/forecast?latitude=48.038&longitude=-1.69238&hourly=temperature_2m")
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.e(TAG, "onFailure: ")
            }

            override fun onResponse(call: Call, response: Response) {
                Log.i(TAG, "onResponse: ${response.body?.string()}")
            }
        })
    }
}