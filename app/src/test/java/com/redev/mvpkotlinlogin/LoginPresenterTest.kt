package com.redev.mvpkotlinlogin

import com.redev.mvpkotlinlogin.Presenter.ILoginPresenter
import com.redev.mvpkotlinlogin.Presenter.LoginPresenter
import com.redev.mvpkotlinlogin.View.ILoginView
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.anyString
import org.mockito.Mockito.never
import org.mockito.MockitoAnnotations

class LoginPresenterTest
{
    private lateinit var iLogin:ILoginPresenter

    @Mock
    private lateinit var iLoginView:ILoginView

    @Before
    fun setUp()
    {
        MockitoAnnotations.initMocks(this)
        iLogin = LoginPresenter(iLoginView)
    }

    @Test
    fun onLogin_nullString_result_error()
    {
        iLogin.onLogin("","")
        Mockito.verify(iLoginView, never()).onError("")
    }

    @Test
    fun onLogin_normalString_result_suc()
    {
        iLogin.onLogin("ka@gmail.com","123456")
        Mockito.verify(iLoginView , never()).onSuccessfully("Login Successfully...")
    }
}