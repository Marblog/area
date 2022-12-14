package cn.marblog.area.service.impl

import cn.marblog.area.entity.Area
import cn.marblog.area.mapper.AreaMapper
import cn.marblog.area.service.IAreaService

import cn.marblog.area.vo.Query
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author majie
 * @since 2022-07-27
 */
@Service
class AreaServiceImpl : ServiceImpl<AreaMapper, Area>(), IAreaService {

    @Autowired
    private lateinit var areaMapper: AreaMapper

    override fun selectPage(query: Query): Result<*> {

        val wrapper = QueryWrapper<Area>().like("name", query.name)
        val page = Page<Area>(query.pageNo, query.pageSize)
        val selectPage = areaMapper.selectPage(page, wrapper)
        return Result.success(selectPage)

    }
}

