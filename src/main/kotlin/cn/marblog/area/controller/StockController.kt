package cn.marblog.area.controller

import cn.marblog.area.entity.Stock
import cn.marblog.area.service.IStockService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/stock")
@Tag(name = "stock")
class StockController {
    @Autowired
    private lateinit var stockService: IStockService


    @GetMapping("/list")
    fun getAreaList(): MutableList<Stock>? {
        return stockService.list()
    }

    @PostMapping("/add")
    fun addStock(stock: Stock): Result<*> {
        val stocks = stockService.getById(stock.id)
        if (stocks != null) {
            val exception = "商品已存在"
        }
        val save = stockService.save(stock)
        return Result.success(save)
    }
}
