package com.example.mod9room.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mod9room.bo.Otter

@Database(entities = [Otter::class],version = 1)
abstract class OtterDataBase : RoomDatabase() {
    abstract fun OtterDao(): OtterDao

    companion object {
        private var INSTANCE: OtterDataBase? = null

        fun getInstance(context: Context): OtterDataBase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(context,OtterDataBase::class.java, "otterdb").fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}