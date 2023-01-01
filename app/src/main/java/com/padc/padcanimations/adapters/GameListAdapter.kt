package com.padc.padcanimations.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.padcanimations.data.vos.GameVO
import com.padc.padcanimations.databinding.ViewHolderGameBinding
import com.padc.padcanimations.delegates.GameViewHolderActionDelegate
import com.padc.padcanimations.viewholders.GameViewHolder

class GameListAdapter(private val mDelegate: GameViewHolderActionDelegate) :
    RecyclerView.Adapter<GameViewHolder>() {

    private var mData: List<GameVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val binding = ViewHolderGameBinding.inflate(LayoutInflater.from(parent.context))
        return GameViewHolder(binding, mDelegate)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        if (mData.isNotEmpty()) {
            holder.bindData(mData[position])
        }
    }

    override fun getItemCount(): Int {
        return mData.count()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(data: List<GameVO>) {
        mData = data
        notifyDataSetChanged()
    }
}