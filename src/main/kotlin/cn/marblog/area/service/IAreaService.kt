package cn.marblog.area.service

import cn.marblog.area.entity.Area
import cn.marblog.area.util.Result
import cn.marblog.area.vo.Query
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
    fun selectPage(query: Query): Result<*>
}