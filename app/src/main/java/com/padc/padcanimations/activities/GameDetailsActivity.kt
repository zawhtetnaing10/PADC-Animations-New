package com.padc.padcanimations.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.padc.padcanimations.R
import com.padc.padcanimations.data.vos.GameVO
import com.padc.padcanimations.databinding.ActivityGameDetailsBinding
import com.padc.padcanimations.mvp.presenters.GameDetailsPresenter
import com.padc.padcanimations.mvp.presenters.GameDetailsPresenterImpl
import com.padc.padcanimations.mvp.views.GameDetailsView

class GameDetailsActivity : AppCompatActivity(), GameDetailsView {

    companion object {

        private const val EXTRA_GAME_ID = "EXTRA_GAME_ID"

        fun newIntent(context: Context, gameId: Int): Intent {
            val intent = Intent(context, GameDetailsActivity::class.java)
            intent.putExtra(EXTRA_GAME_ID, gameId)
            return intent
        }
    }

    private lateinit var binding: ActivityGameDetailsBinding

    private lateinit var mPresenter: GameDetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        supportActionBar?.title = "Game Details"

        setUpPresenter()
        mPresenter.onUiReady(intent.getIntExtra(EXTRA_GAME_ID, -1))
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[GameDetailsPresenterImpl::class.java]
        mPresenter.attachView(this)
    }

    override fun bindGameData(game: GameVO) {
        Glide.with(this)
            .load(game.image)
            .into(binding.ivGameImage)

        binding.tvGameName.text = game.name
        binding.tvDescription.text = game.description
        binding.tvDeveloper.text = game.developer
        binding.tvPublisher.text = game.publisher
    }
}