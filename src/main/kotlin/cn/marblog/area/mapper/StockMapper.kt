package cn.marblog.area.mapper

import cn.marblog.area.entity.Stock
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

@Mapper
interface StockMapper : BaseMapper<Stock> {


    fun addArticle(articleId: String)

}