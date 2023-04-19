package com.example.mod10recyclerview.bo

data class Tuning (
        val baseCar : String,
        val color: String,
        val rimSize: Int,
        val batteryCapacity: Int,
        val owner: String = "Christophe",
        val dbMax: Float,
        val horsePower: Float,
        val imageUrl: String
        )