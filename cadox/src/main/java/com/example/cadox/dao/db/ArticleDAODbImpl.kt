package com.example.cadox.dao.db

import com.example.cadox.bo.Article
import com.example.cadox.dao.IArticleDAO

class ArticleDAODbImpl : IArticleDAO {
    override fun getArticleByID(id: Long): Article {
        TODO("Not yet implemented")
    }

    override fun getArticleByAll(): List<Article> {
        TODO("Not yet implemented")
    }

    override fun deleteArticleById(id: Long): Long {
        TODO("Not yet implemented")
    }

    override fun deleteArticleByAll(): List<Long> {
        TODO("Not yet implemented")
    }

    override fun addArticle(article: Article): Article {
        TODO("Not yet implemented")
    }
}