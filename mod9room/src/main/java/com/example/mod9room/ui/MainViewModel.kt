package com.example.mod9room.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mod9room.bo.Otter
import com.example.mod9room.dao.OtterDao
import com.example.mod9room.dao.OtterDataBase
import kotlinx.coroutines.launch

class MainViewModel(val dao: OtterDao): ViewModel() {

    lateinit var listOtter: List<Otter>
    init {
        viewModelScope.launch {
            listOtter = dao.getAll()
        }
    }
    fun addOtter(otter: Otter) {
        dao.add(otter)
    }
}