package com.redev.mvpkotlinlogin.Presenter

import android.text.TextUtils
import com.redev.mvpkotlinlogin.Model.User
import com.redev.mvpkotlinlogin.View.ILoginView

class LoginPresenter(val iLoginView:ILoginView) : ILoginPresenter {

    override fun onLogin(user: String, pass: String) {

        val user = User(user , pass)

        if(user.vadiate())
        {
            iLoginView.onSuccessfully("Login Successfully..")
        }
        else
        {
            iLoginView.onError("Login Error..")
        }

    }

}