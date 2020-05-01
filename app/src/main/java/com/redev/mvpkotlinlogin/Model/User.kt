package com.redev.mvpkotlinlogin.Model

import android.text.TextUtils
import android.util.Patterns
import com.redev.mvpkotlinlogin.Presenter.IUser

class User(var user:String = "", var pass:String = "") : IUser{
     fun vadiate(): Boolean {

        if(getEmail().equals("ka@gmail.com") && getPassword().equals("123456"))
        {
            return true
        }

        return false
    }

    override fun getEmail(): String {
        return user
    }

    override fun getPassword(): String {
      return pass
    }
}