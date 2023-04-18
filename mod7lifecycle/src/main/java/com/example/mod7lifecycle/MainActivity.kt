package com.example.mod7lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mod7lifecycle.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

private const val  TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    val viewModel : MainViewModel by viewModels()
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Log.i(TAG, "onCreate: ")
        binding.vm = viewModel
        binding.fabAdd.setOnClickListener {
            viewModel.incrementCounter()
        }
        binding.fabAdd.setOnLongClickListener {
            viewModel.decrementCounter()
            return@setOnLongClickListener true
        }
        binding.lifecycleOwner = this
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}