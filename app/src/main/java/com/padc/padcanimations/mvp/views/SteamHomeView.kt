package com.padc.padcanimations.mvp.views

import android.view.View
import com.padc.padcanimations.data.vos.GameVO

interface SteamHomeView {
    fun showGames(gameList: List<GameVO>)
    fun navigateToGameDetails(gameId: Int, transitionPair: androidx.core.util.Pair<View, String>)
}