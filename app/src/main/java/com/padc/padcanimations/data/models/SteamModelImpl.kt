package com.padc.padcanimations.data.models

import com.padc.padcanimations.data.getGames
import com.padc.padcanimations.data.vos.GameVO

object SteamModelImpl : SteamModel {
    override fun getAllGames(): List<GameVO> {
        return getGames()
    }
}