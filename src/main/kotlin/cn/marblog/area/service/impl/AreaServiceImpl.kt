package cn.marblog.area.service.impl;

import cn.marblog.area.entity.Area
import cn.marblog.area.mapper.AreaMapper
import cn.marblog.area.service.IAreaService
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
    lateinit var areaMapper: AreaMapper

    override fun selectPage(pageNo: Long, pageSize: Long): List<Area> {
        val wrapper = QueryWrapper<Area>()
        val page = Page<Area>(pageNo, pageSize)
        val selectPage = areaMapper.selectPage(page)
        return selectPage
    }
}
