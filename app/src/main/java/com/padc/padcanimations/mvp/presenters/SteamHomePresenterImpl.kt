package com.padc.padcanimations.mvp.presenters

import android.view.View
import androidx.lifecycle.ViewModel
import com.padc.padcanimations.data.models.SteamModel
import com.padc.padcanimations.data.models.SteamModelImpl
import com.padc.padcanimations.mvp.views.SteamHomeView

class SteamHomePresenterImpl : SteamHomePresenter, ViewModel() {

    // Model
    private val mSteamModel: SteamModel = SteamModelImpl

    // View
    private var mView: SteamHomeView? = null

    override fun attachView(view: SteamHomeView) {
        mView = view
    }

    override fun onUiReady() {
        mView?.showGames(mSteamModel.getAllGames())
    }

    override fun onTapGame(gameId: Int, transitionPair: androidx.core.util.Pair<View, String>) {
        mView?.navigateToGameDetails(gameId, transitionPair)
    }


}