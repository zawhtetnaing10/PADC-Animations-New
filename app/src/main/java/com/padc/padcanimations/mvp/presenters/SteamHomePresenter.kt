package com.padc.padcanimations.mvp.presenters

import com.padc.padcanimations.mvp.views.SteamHomeView

interface SteamHomePresenter {
    fun attachView(view : SteamHomeView)
    fun onUiReady()
}
