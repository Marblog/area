package cn.marblog.area.service.impl

import cn.marblog.area.entity.Article
import cn.marblog.area.mapper.ArticleMapper
import cn.marblog.area.service.IArticleService
import cn.marblog.area.vo.Query
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ArticleServiceImpl : ServiceImpl<ArticleMapper, Article>(), IArticleService {

    @Autowired
    private lateinit var articleMapper: ArticleMapper

    override fun selectPage(query: Query): Result<*> {
        val wrapper = QueryWrapper<Article>().like("article_name", query.name)
        val page = Page<Article>(query.pageNo, query.pageSize)
        val selectPage = articleMapper.selectPage(page, wrapper)
        return Result.success(selectPage)
    }

}

