package cn.marblog.area.service

import cn.marblog.area.entity.Stock
import cn.marblog.area.vo.Query
import com.baomidou.mybatisplus.extension.service.IService


interface IStockService : IService<Stock> {
    fun selectPage(query: Query): Result<*>


    fun addArticle(articleId: String?)
}