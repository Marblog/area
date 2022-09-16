package cn.marblog.area.service

import cn.marblog.area.entity.Article
import cn.marblog.area.vo.Query
import com.baomidou.mybatisplus.extension.service.IService


interface IArticleService : IService<Article> {
    fun selectPage(query: Query): Result<*>

}