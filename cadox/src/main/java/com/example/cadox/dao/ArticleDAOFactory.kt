package com.example.cadox.dao

import com.example.cadox.dao.db.ArticleDAODbImpl
import com.example.cadox.dao.memory.ArticleDAOMemoryImpl
import com.example.cadox.dao.apirest.ArticleDaoInternetImpl

object ArticleDAOFactory {
    fun createArticleDAO(type : ArticleDAOType) : IArticleDAO {
        when (type) {
            ArticleDAOType.DB -> return ArticleDAODbImpl()
            ArticleDAOType.MEMORY -> return ArticleDAOMemoryImpl()
            ArticleDAOType.INTERNET -> return ArticleDaoInternetImpl()
        }
    }
}