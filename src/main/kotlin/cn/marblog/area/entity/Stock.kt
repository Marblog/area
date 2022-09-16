package cn.marblog.area.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import java.io.Serializable

/**
 * 库存
 * @TableName stock
 */
class Stock : Serializable {

    @TableId(type = IdType.AUTO)
    var id: Int? = null

    var stockName: String? = null

    var articleId: String? = null

}