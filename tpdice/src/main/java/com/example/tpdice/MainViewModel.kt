package com.example.tpdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var dice = MutableLiveData(0)

    fun launchDice(diceMax : Int) {
        dice.value = (1..diceMax).random();
    }
}