package com.padc.padcanimations.delegates

import android.view.View

interface GameViewHolderActionDelegate {
    fun onTapGame(gameId: Int, transitionPair: androidx.core.util.Pair<View, String>)
}