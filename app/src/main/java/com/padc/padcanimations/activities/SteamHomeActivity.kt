package com.padc.padcanimations.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.padcanimations.R
import com.padc.padcanimations.adapters.GameListAdapter
import com.padc.padcanimations.data.vos.GameVO
import com.padc.padcanimations.databinding.ActivityMainBinding
import com.padc.padcanimations.databinding.ActivitySteamHomeBinding
import com.padc.padcanimations.mvp.presenters.SteamHomePresenter
import com.padc.padcanimations.mvp.presenters.SteamHomePresenterImpl
import com.padc.padcanimations.mvp.views.SteamHomeView

class SteamHomeActivity : AppCompatActivity(), SteamHomeView {

    // Binding
    private lateinit var binding: ActivitySteamHomeBinding

    // Adapter
    private val mAdapter = GameListAdapter()

    // Presenter
    private lateinit var mPresenter: SteamHomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySteamHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpPresenter()
        setUpRecyclerView()

        mPresenter.onUiReady()
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[SteamHomePresenterImpl::class.java]
        mPresenter.attachView(this)
    }

    private fun setUpRecyclerView() {
        binding.rvGames.also {
            it.adapter = mAdapter
            it.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        }
    }

    override fun showGames(gameList: List<GameVO>) {
        mAdapter.setNewData(gameList)
    }
}