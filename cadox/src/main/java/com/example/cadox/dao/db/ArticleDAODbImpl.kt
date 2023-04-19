package com.example.cadox.dao.db

import com.example.cadox.bo.Article
import com.example.cadox.dao.IArticleDAO

class ArticleDAODbImpl : IArticleDAO {
    private val articlesInDb: MutableList<Article> = mutableListOf<Article>(
        Article(1, "Des lunettes de soleil (memory)",
            "RAY-BAN RB 4259 601/19 51/20",
            85.0,
            3,
             "",
                false,
            "https://www.optical-center.fr/lunettes-de-soleil/lunettes-de-soleil-RAY-BAN-RB-4259-60119-5120-25318.html?gclid=EAIaIQobChMIitHizMWe5QIVloXVCh1X6gw_EAQYASABEgLu0PD_BwE"),
        Article(2,"Glacé (memory)",
            "Livre, XO éditions, Thriller, Bernard Minier",
            8.25, 4,
            "",
            false,
            "https://livre.fnac.com/a10408001/Bernard-Minier-Glace")
        ,Article(3,"Complètement cramé ! (memory)", "Livre, Pocket, Humour, Gilles Legardinier", 7.60, 5,
            "",
            false,
            "https://www.amazon.fr/Compl%C3%A8tement-cram%C3%A9-Gilles-Legardinier/dp/2266246194")
    )
    override fun getArticleByID(id: Long): Article {
        TODO("Not yet implemented")
    }

    override fun getArticleByAll(): List<Article> {
        return articlesInDb
    }

    override fun deleteArticleById(article : Article)  {
        TODO("Not yet implemented")
    }


    override fun addArticle(article: Article) {
        TODO("Not yet implemented")
    }
}