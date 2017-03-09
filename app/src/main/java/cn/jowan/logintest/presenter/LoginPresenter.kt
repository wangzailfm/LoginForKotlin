package cn.jowan.logintest.presenter

import cn.jowan.logintest.bean.LoginResponse
import cn.jowan.logintest.bean.RegisterResponse

/**
 * Created by pc on 2017/3/8.
 */
interface LoginPresenter {

    /**
     * 登录
     */
    fun login(username: String, password: String)

    /**
     * 登录接口
     */
    interface onLoginListener {
        /**
         * 登录成功
         */
        fun loginSuccess(result: LoginResponse)

        /**
         * 登录失败
         */
        fun loginFailed(message: String?)
    }

    /**
     * 注册
     */
    fun register(username: String, password: String, email: String)

    /**
     * 注册接口
     */
    interface onRegisterListener {
        /**
         * 注册成功
         */
        fun registerSuccess(result: RegisterResponse)

        /**
         * 注册失败
         */
        fun registerFailed(message: String?)
    }
}