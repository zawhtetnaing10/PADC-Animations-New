package com.padc.padcanimations.mvp.presenters

import androidx.lifecycle.ViewModel
import com.padc.padcanimations.data.models.SteamModel
import com.padc.padcanimations.data.models.SteamModelImpl
import com.padc.padcanimations.mvp.views.GameDetailsView

class GameDetailsPresenterImpl : GameDetailsPresenter, ViewModel(){

    // Model
    private val mSteamModel: SteamModel = SteamModelImpl

    // View
    private var mView: GameDetailsView? = null

    override fun attachView(view: GameDetailsView) {
        mView = view
    }

    override fun onUiReady(gameId: Int) {
        mSteamModel.getGameById(gameId).also {
            mView?.bindGameData(it)
        }
    }

}