package cn.jowan.logintest.bean

/**
 * 登录返回
 * retCode	返回码
 * msg	返回说明
 * result	返回结果集
 * msg错误码：
 * 200	成功
 * 10001	appkey不合法
 * 10020	接口维护
 * 10021	接口停用
 * 22801	查询不到相关数据
 * 22802	username不允许为空
 * 22803	password不允许为空
 * 22807	用户名或密码错误
 */
data class LoginResponse(val msg: String, val result: LoginResultResponse, val retCode: String)