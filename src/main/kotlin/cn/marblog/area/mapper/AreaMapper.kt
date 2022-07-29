package cn.marblog.area.mapper

import cn.marblog.area.entity.Area
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import org.apache.ibatis.annotations.Mapper

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author majie
 * @since 2022-07-27
 */
@Mapper
interface AreaMapper : BaseMapper<Area> {


    fun selectByPage(page: Page<Area>): IPage<Area>

}