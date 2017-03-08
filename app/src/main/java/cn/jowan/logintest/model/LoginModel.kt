package cn.jowan.logintest.model

import cn.jowan.logintest.presenter.LoginPresenter

/**
 * Created by pc on 2017/3/8.
 */
interface LoginModel {
    /**
     * 登录
     */
    fun login(onLoginListener: LoginPresenter.onLoginListener, username: String, password: String)

    /**
     * 注册
     */
    fun register(onRegisterListener: LoginPresenter.onRegisterListener, username: String, password: String, email: String)
}