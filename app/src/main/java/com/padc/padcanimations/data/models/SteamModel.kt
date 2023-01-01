package com.padc.padcanimations.data.models

import com.padc.padcanimations.data.vos.GameVO

interface SteamModel {
    fun getAllGames() : List<GameVO>
}