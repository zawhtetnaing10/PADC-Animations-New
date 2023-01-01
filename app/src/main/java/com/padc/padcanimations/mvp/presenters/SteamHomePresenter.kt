package com.padc.padcanimations.mvp.presenters

import com.padc.padcanimations.delegates.GameViewHolderActionDelegate
import com.padc.padcanimations.mvp.views.SteamHomeView

interface SteamHomePresenter : GameViewHolderActionDelegate{
    fun attachView(view : SteamHomeView)
    fun onUiReady()
}
