package com.example.mod10recyclerview

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.bo.Tuning
import com.example.mod10recyclerview.databinding.TemplateTuningBinding
import com.squareup.picasso.Picasso

class TuningAdapter (val arrayList: ArrayList<Tuning>, val onClickTuning : (tuning : Tuning) -> Unit) : RecyclerView.Adapter<TuningAdapter.TuningVH>() {
    class TuningVH(val binding: TemplateTuningBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TuningVH {
        val binding = TemplateTuningBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return TuningVH(binding)
    }

    override fun getItemCount() : Int = arrayList.size


    override fun onBindViewHolder(holder: TuningVH, position: Int) {
        val tuning = arrayList[position]
        holder.itemView.setOnClickListener {
            onClickTuning(tuning)
        }
        holder.binding.tuning = tuning
        Picasso.get().load(Uri.parse(arrayList[position].imageUrl)).into(holder.binding.imageView)
    }

}