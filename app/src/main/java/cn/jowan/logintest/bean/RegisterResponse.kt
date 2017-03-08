package cn.jowan.logintest.bean

/**
 * 注册返回
 * retCode	返回码
 * msg	返回说明
 * uid	用户id
 * msg错误码：
 * 200	成功
 * 10001	appkey不合法
 * 10020	接口维护
 * 10021	接口停用
 * 22802	username不允许为空
 * 22803	password不允许为空
 * 22806	此用户名已存在
 * 22807	用户名或密码错误
 * 22810	用户未登录或token已过期
 * 22817	email不允许为空
 * 22818	email不符合邮箱格式
 * 22823	此邮箱已存在
 */
data class RegisterResponse(val retCode: String, val msg: String, val uid: String?)