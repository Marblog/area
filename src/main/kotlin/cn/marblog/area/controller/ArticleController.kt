package cn.marblog.area.controller

import cn.marblog.area.entity.Article
import cn.marblog.area.service.IArticleService
import cn.marblog.area.service.IStockService
import cn.marblog.area.vo.Query
import io.swagger.v3.oas.annotations.parameters.RequestBody
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/article")
@Tag(name = "article")
class ArticleController {
    @Autowired
    private lateinit var articleService: IArticleService

    @Autowired
    private lateinit var stockService: IStockService

    @GetMapping("/list")
    fun getList(query: Query): Result<*> {
        return articleService.selectPage(query)
    }

    @GetMapping("/listById")
    fun getListById(id: String): Result<*> {
        return Result.success(articleService.getById(id))
    }

    @PostMapping("/add")
    fun addArticle(article: Article): Result<*> {
        val articles = articleService.getById(article.id)
//        if (articles != null) {
//            val exception = "商品已存在"
//        }
        article.id = UUID.randomUUID().toString().replace("-", "")
        val save = articleService.save(article)
        return Result.success(save)
    }

    @DeleteMapping("/delete")
    fun deleteArticle(id: String): Boolean {
        return articleService.removeById(id)
    }

    @PutMapping("/update")
    fun updateArticle(@RequestBody article: Article): Boolean {
        return articleService.updateById(article)

    }

    @PostMapping("/in")
    fun inStock(article: Article) {
        stockService.addArticle(article.id)
    }

    @PostMapping("/out")
    fun outStock(article: Article) {
        stockService.addArticle(article.id)
    }
}
