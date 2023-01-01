package com.padc.padcanimations.mvp.views

import com.padc.padcanimations.data.vos.GameVO

interface GameDetailsView {
    fun bindGameData(game: GameVO)
}