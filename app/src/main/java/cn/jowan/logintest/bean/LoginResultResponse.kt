package cn.jowan.logintest.bean

/**
 * 登录返回result
 * token	用户登录生成的token
 * uid	用户Id
 */
data class LoginResultResponse(val token: String, val uid: String)