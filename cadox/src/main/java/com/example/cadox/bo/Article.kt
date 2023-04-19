package com.example.cadox.bo

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity
data class Article (
        @PrimaryKey(autoGenerate = true)
        val id:Long = 0,
        val intitule: String,
        val description: String,
        val prix: Double,
        val niveau: Byte,
        val date: String,
        val achete: Boolean = false,
        val url:String?) : Parcelable {


        fun isAchete(achete : Boolean): Boolean {
                return achete
        }
}