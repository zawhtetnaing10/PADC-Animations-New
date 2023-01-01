package com.padc.padcanimations.mvp.views

import com.padc.padcanimations.data.vos.GameVO

interface SteamHomeView {
    fun showGames(gameList : List<GameVO>)
}