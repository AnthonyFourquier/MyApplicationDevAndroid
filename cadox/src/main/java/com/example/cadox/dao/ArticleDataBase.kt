package com.example.cadox.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cadox.bo.Article

@Database(entities = [Article::class],version = 1)
abstract class ArticleDataBase : RoomDatabase() {
    abstract fun articleDao(): IArticleDAO

    companion object {
        private var INSTANCE: ArticleDataBase? = null

        fun getInstance(context: Context): ArticleDataBase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(context,ArticleDataBase::class.java, "article_db").fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }

}