package com.padc.padcanimations.mvp.presenters

import com.padc.padcanimations.mvp.views.GameDetailsView
import com.padc.padcanimations.mvp.views.SteamHomeView

interface GameDetailsPresenter {
    fun attachView(view: GameDetailsView)
    fun onUiReady(gameId: Int)
}