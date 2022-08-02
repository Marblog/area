package cn.marblog.area.entity

import java.io.Serializable

/**
 * <p>
 *
 * </p>
 *
 * @author majie
 * @since 2022-07-27
 */
class Area : Serializable {

    /**
     * 区划代码
     */
    var id: Long? = null

    /**
     * 名称
     */
    var name: String? = null

    /**
     * 父级区划代码
     */
    var pid: Long? = null

    /**
     * 省/直辖市代码
     */
    var provinceCode: Long? = null

    /**
     * 市代码
     */
    var cityCode: Long? = null

    /**
     * 区/县代码
     */
    var areaCode: Long? = null

    /**
     * 街道/镇代码
     */
    var streetCode: Long? = null

    /**
     * 社区/乡村代码
     */
    var committeeCode: Long? = null

    /**
     * 城乡分类代码
     */
    var committeeType: Long? = null

    /**
     * 排序
     */
    var sort: Int? = null

    /**
     * 级别: 1-省/直辖市, 2-市, 3-区/县/地级市, 4-街道/镇, 5-社区/乡村
     */
    var level: Int? = null

}
