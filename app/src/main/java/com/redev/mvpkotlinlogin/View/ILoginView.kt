package com.redev.mvpkotlinlogin.View

interface ILoginView {
    fun onSuccessfully(result:String)
    fun onError(result: String)
}