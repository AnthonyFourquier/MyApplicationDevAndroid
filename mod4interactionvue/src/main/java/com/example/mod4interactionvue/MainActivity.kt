package com.example.mod4interactionvue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mod4interactionvue.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //val textView = findViewById<TextView>(R.id.TextView)
        //val button = findViewById<Button>(R.id.button)

        binding.button.setOnClickListener {
            binding.TextView.text = "test edit textView"
            Snackbar.make(it, "Test show snackBar", Snackbar.LENGTH_LONG)
                .apply {
                    setAction( "Annuler") { dismiss() }
                    show()
                }
        }





    }
}