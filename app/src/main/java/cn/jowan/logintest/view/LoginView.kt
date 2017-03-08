package cn.jowan.logintest.view

import cn.jowan.logintest.bean.LoginResponse
import cn.jowan.logintest.bean.RegisterResponse

/**
 * Created by pc on 2017/3/8.
 */
interface LoginView {
    /**
     * 登录成功
     */
    fun loginSuccess(result: LoginResponse)

    /**
     * 登录失败
     */
    fun loginFailed(message: String?)

    /**
     * 注册成功
     */
    fun registerSuccess(result: RegisterResponse)

    /**
     * 注册失败
     */
    fun registerFailed(message: String?)
}