package com.padc.padcanimations.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.padc.padcanimations.R
import com.padc.padcanimations.data.vos.GameVO
import com.padc.padcanimations.databinding.ViewHolderGameBinding
import com.padc.padcanimations.delegates.GameViewHolderActionDelegate

class GameViewHolder(
    private val binding: ViewHolderGameBinding,
    private val mDelegate: GameViewHolderActionDelegate?
) :
    RecyclerView.ViewHolder(binding.root) {

    var mData: GameVO? = null

    init {
        binding.ivGameImage.setOnClickListener {
            mDelegate?.onTapGame(
                mData?.id ?: -1, androidx.core.util.Pair.create(
                    binding.ivGameImage, binding.root.resources.getString(
                        R.string.transition_game
                    )
                )
            )
        }
    }

    fun bindData(data: GameVO) {
        mData = data

        binding.tvDescription.text = data.description
        binding.tvPrice.text = "$ ${data.price}"

        Glide.with(binding.ivGameImage.context)
            .load(data.image)
            .into(binding.ivGameImage)
    }
}