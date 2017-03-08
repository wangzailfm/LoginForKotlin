package cn.jowan.logintest.presenter

import cn.jowan.logintest.bean.LoginResponse
import cn.jowan.logintest.bean.RegisterResponse
import cn.jowan.logintest.model.LoginModel
import cn.jowan.logintest.model.LoginModelImpl
import cn.jowan.logintest.view.LoginView

/**
 * Created by pc on 2017/3/8.
 */
class LoginPresenterImpl(val loginView: LoginView) : LoginPresenter, LoginPresenter.onLoginListener, LoginPresenter.onRegisterListener {

    val mLoginModel: LoginModel

    init {
        mLoginModel = LoginModelImpl()
    }

    override fun login(username: String, password: String) {
        mLoginModel.login(this, username, password)
    }

    override fun loginSuccess(result: LoginResponse) {
        loginView.loginSuccess(result)
    }

    override fun loginFailed(message: String?) {
        loginView.loginFailed(message)
    }

    override fun register(username: String, password: String, email: String) {
        mLoginModel.register(this, username, password, email)
    }

    override fun registerSuccess(result: RegisterResponse) {
        loginView.registerSuccess(result)
    }

    override fun registerFailed(message: String?) {
        loginView.registerFailed(message)
    }
}