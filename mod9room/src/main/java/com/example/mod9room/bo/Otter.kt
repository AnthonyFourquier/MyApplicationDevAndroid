package com.example.mod9room.bo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class SexOtter {
    MALE, FEMALE
}

@Entity
data class Otter (
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0,
    val name: String,
    val sexe: SexOtter,
    val cutenessIndex: Byte,
    val age: Int,
    val isAlive: Boolean,
    val size: Float,
)