package com.example.tpdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.tpdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val viewModel : MainViewModel by viewModels()
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dice = viewModel
        binding.buttonDice6.setOnClickListener {
            viewModel.launchDice(6)
        }
        binding.buttonDice12.setOnClickListener {
            viewModel.launchDice(12)
        }
        binding.buttonDice16.setOnClickListener {
            viewModel.launchDice(16)
        }
        binding.buttonDice9.setOnClickListener {
            viewModel.launchDice(9)
        }
        binding.buttonDice18.setOnClickListener {
            viewModel.launchDice(18)
        }
        binding.buttonDice20.setOnClickListener {
            viewModel.launchDice(20)
        }
        binding.lifecycleOwner = this
    }
}