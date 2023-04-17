package com.example.mod6

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    val intentMap = Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.0389009,-1.69238"))
    val intentCall = Intent(Intent.ACTION_VIEW, Uri.parse("tel:12345678"))
    val intentCallView = Intent(Intent.ACTION_VIEW, Uri.parse("tel:87654321"))

    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        startActivity(
            if(isGranted)
                intentCall
            else
                intentCallView
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))

        }

        findViewById<Button>(R.id.buttonCall).setOnClickListener { startActivity(intentCall)
            requestPermissionLauncher.launch(android.Manifest.permission.CALL_PHONE)
        }
        findViewById<Button>(R.id.buttonENI).setOnClickListener { startActivity(intentMap) }

    }
}