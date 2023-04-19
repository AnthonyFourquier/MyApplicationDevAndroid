package com.example.cadox.repository

import com.example.cadox.bo.Article
import com.example.cadox.dao.ArticleDAOType
import com.example.cadox.dao.ArticleDAOFactory


object ArticleRepository {
    private var iArticleDao = ArticleDAOFactory.createArticleDAO(ArticleDAOType.DB)

    fun getArticleById(id : Long) : Article {
        return iArticleDao.getArticleByID(id)
    }

    fun addArticle(article: Article) {
        return iArticleDao.addArticle(article)
    }

    fun deleteArticleById(article : Article) {
        return iArticleDao.deleteArticleById(article)
    }

    fun getArticleByAll() : List<Article> {
        return iArticleDao.getArticleByAll()
    }

}