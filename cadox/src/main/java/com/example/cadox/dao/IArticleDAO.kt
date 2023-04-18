package com.example.cadox.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.cadox.bo.Article

@Dao
interface IArticleDAO {
    @Query("SELECT * FROM article WHERE uid = :uid")
    fun getArticleByID(id : Long) : Article
    @Query("SELECT * FROM article")
    fun getArticleByAll() : List<Article>
    @Delete
    fun deleteArticleById(id : Long) : Long
    @Delete
    fun deleteArticleByAll() : List<Long>
    @Insert
    fun addArticle(article : Article) : Article
 }