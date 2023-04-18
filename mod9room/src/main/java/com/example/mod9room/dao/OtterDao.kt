package com.example.mod9room.dao

import androidx.room.*
import com.example.mod9room.bo.Otter

@Dao
interface OtterDao {
    @Query("SELECT * FROM Otter WHERE id = :id")
    fun getOtter(id : Long): Otter?
    @Query("SELECT * FROM Otter")
    fun getAll(): List<Otter>
    @Insert
    fun add(otter: Otter) : Long
    @Update
    fun update(otter: Otter) : Int
    @Delete
    fun delete(otter: Otter) : Int

}