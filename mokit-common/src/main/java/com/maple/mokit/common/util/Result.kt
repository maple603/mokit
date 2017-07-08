package com.maple.mokit.common.util

import java.io.Serializable

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/8 下午10:51.
 */
open  class Result<T> : Serializable{

    var success: Boolean = true

    var model:T ? = null

    var msgCode: String ?= ""

    var httpStatusCode: Int = 200

    var msgInfo: String ? = ""

    var headers:Map<String,String> = mapOf()

    var bizExtMap: Map<String,String> = mapOf()




}