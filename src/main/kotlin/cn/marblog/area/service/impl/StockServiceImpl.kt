package cn.marblog.area.service.impl

import cn.marblog.area.entity.Stock
import cn.marblog.area.mapper.StockMapper
import cn.marblog.area.service.IStockService
import cn.marblog.area.vo.Query
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class StockServiceImpl : ServiceImpl<StockMapper, Stock>(), IStockService {

    @Autowired
    private lateinit var stockMapper: StockMapper


    override fun selectPage(query: Query): Result<*> {
        val wrapper = QueryWrapper<Stock>().like("name", query.name)
        val page = Page<Stock>(query.pageNo, query.pageSize)
        val selectPage = stockMapper.selectPage(page, wrapper)
        return Result.success(selectPage)
    }

    override fun addArticle(articleId: String?) {
        TODO("Not yet implemented")
    }
}

