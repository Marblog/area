package cn.marblog.area.service;

import cn.marblog.area.entity.Area
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author majie
 * @since 2022-07-27
 */
interface IAreaService : IService<Area> {
    fun selectPage(pageNo: Long, pageSize: Long): List<Area>
}