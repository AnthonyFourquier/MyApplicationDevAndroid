package com.example.cadox.bo

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
@Entity
data class Article (
        @PrimaryKey(autoGenerate = true)
        val uid:Long = 0,
        @ColumnInfo(name = "intitule")
        val intitule: String,
        @ColumnInfo(name = "description")
        val description: String,
        @ColumnInfo(name = "prix")
        val prix: Double,
        @ColumnInfo(name = "niveau")
        val niveau: Byte,
        @ColumnInfo(name = "url")
        val url:String?) : Parcelable {
        @ColumnInfo(name = "achete")
        val achete:Boolean = false
        @ColumnInfo(name = "date_achat")
        val dateAchat: LocalDate?=null
}