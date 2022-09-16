package cn.marblog.area.mapper

import cn.marblog.area.entity.Article
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

@Mapper
interface ArticleMapper : BaseMapper<Article> {


}