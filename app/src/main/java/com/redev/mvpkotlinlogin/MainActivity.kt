package com.redev.mvpkotlinlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.redev.mvpkotlinlogin.Presenter.ILoginPresenter
import com.redev.mvpkotlinlogin.Presenter.LoginPresenter
import com.redev.mvpkotlinlogin.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , ILoginView{

    private lateinit var iLogin:ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialByid()
        btn_login.setOnClickListener {
            iLogin.onLogin(txt_user.text.toString() , txt_password.text.toString())
        }
    }

    private fun initialByid() {
        iLogin = LoginPresenter(this)
    }

    override fun onSuccessfully(result: String) {
      Log.i("onSuccessfully","Login Successfully...")
    }

    override fun onError(result: String) {
        Log.i("onError","Login Error...")
    }

}
