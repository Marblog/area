package cn.marblog.area.util

import com.baomidou.mybatisplus.generator.FastAutoGenerator
import com.baomidou.mybatisplus.generator.config.GlobalConfig
import com.baomidou.mybatisplus.generator.config.OutputFile
import com.baomidou.mybatisplus.generator.config.PackageConfig
import com.baomidou.mybatisplus.generator.config.StrategyConfig
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine
import java.util.*

/**
 * @author 18721
 */
object AutoGenerator {
    @JvmStatic
    fun main(args: Array<String>) {
        FastAutoGenerator.create(
            "jdbc:mysql://localhost:3306/china_area",
            "root",
            "123456"
        )
            .globalConfig { builder: GlobalConfig.Builder ->
                builder.author("majie")
                    .disableOpenDir()
                    .enableKotlin()
                    .outputDir("D:\\project\\area\\src\\main\\ccc")
            }
            .packageConfig { builder: PackageConfig.Builder ->
                builder.parent("cn.marblog")
                    .moduleName("area")
                    .pathInfo(
                        Collections.singletonMap(
                            OutputFile.xml,
                            "D:\\project\\area\\src\\resources\\mapper\\xml"
                        )
                    )
            }
            .strategyConfig { builder: StrategyConfig.Builder ->
                builder.addInclude("area")
                    .addTablePrefix("t_", "c_")
            }
            .templateEngine(FreemarkerTemplateEngine())
            .execute()
    }
}