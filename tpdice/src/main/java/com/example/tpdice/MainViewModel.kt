package com.example.mod7lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var cpt = MutableLiveData(0)
    fun incrementCounter() {
        //On affecte a notre compteur l'ancienne valueur + 1
        cpt.value =  cpt.value?.plus(1)
    }

    fun decrementCounter() {
        //On affecte a notre compteur l'ancienne valueur - 1
        cpt.value =  cpt.value?.minus(1)
    }
}