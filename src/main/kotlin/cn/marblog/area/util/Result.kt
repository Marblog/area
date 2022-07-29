package cn.marblog.area.util


class Result<T> {

    private var status: String? = null

    private var message: String

    private var data: T? = null

    private constructor(status: String, message: String, data: T) {
        this.status = status
        this.message = message
        this.data = data
    }

    private constructor(status: String, message: String) {
        this.status = status
        this.message = message
    }

    private constructor(message: String) {
        this.message = message
    }


    enum class Status(

        val code: String,

        val reason: String
    ) {
        /**
         * 状态
         */
        OK("200", "正确"),
        BAD_REQUEST("400", "错误的请求"),
        UNAUTHORIZED("401", "禁止访问"),
        NOT_FOUND(
            "404",
            "没有可用的数据"
        ),
        PWD_EEOR(
            "300",
            "密码错误"
        ),
        EXIT(
            "403",
            "已经存在"
        ),
        INTERNAL_SERVER_ERROR(
            "500",
            "服务器遇到了一个未曾预料的状况"
        ),
        SERVICE_UNAVAILABLE("503", "服务器当前无法处理请求"), ERROR("9999", "数据不能为空");

        override fun toString(): String {
            return "$code: $reason"
        }
    }

    companion object {
        /**
         * 创建一个带有**状态**、**消息**和**数据**的结果对象.
         *
         * @param status
         * 状态
         * @param message
         * 消息内容
         * @param data
         * 数据
         * @return 结构数据
         */
        fun <T> buildResult(status: Status, message: String, data: T): Result<T> {
            return Result(status.code, message, data)
        }

        /**
         * 创建一个带有**状态**、**消息**和**数据**的结果对象.
         *
         * @param status
         * 状态
         * @param message
         * 消息内容
         * @return 结构数据
         */
        fun <T> buildResult(status: Status, message: String): Result<T> {
            return Result(status.code, message)
        }

        /**
         * 创建一个带有**状态**和**数据**的结果对象.
         *
         * @param status
         * 状态
         * @param data
         * 数据
         * @return 结构数据
         */
        fun <T> buildResult(status: Status, data: T): Result<T> {
            return Result(status.code, status.reason, data)
        }

        /**
         * 创建一个带有**状态**的结果对象.
         *
         * @param status
         * 状态
         * @return 结构数据
         */
        fun <T> buildResult(status: Status): Result<T> {
            return Result(status.code, status.reason)
        }
    }
}