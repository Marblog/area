package cn.marblog.area.controller

import cn.marblog.area.service.IAreaService

import cn.marblog.area.vo.Query
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author majie
 * @since 2022-07-27
 */
@RestController
@RequestMapping("/area")
@Tag(name = "area")
class AreaController {
    @Autowired
    private lateinit var areaService: IAreaService

    @GetMapping("/list")
    fun getAreaList(query: Query): Result<*> {

        return areaService.selectPage(query)
    }
}
