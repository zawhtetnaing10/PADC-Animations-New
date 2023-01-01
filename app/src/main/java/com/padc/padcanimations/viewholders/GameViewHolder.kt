package com.padc.padcanimations.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.padc.padcanimations.data.vos.GameVO
import com.padc.padcanimations.databinding.ViewHolderGameBinding

class GameViewHolder(private val binding: ViewHolderGameBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindData(data: GameVO) {
        binding.tvDescription.text = data.description
        binding.tvPrice.text = data.price.toString()

        Glide.with(binding.ivGameImage.context)
            .load(data.image)
            .into(binding.ivGameImage)
    }
}