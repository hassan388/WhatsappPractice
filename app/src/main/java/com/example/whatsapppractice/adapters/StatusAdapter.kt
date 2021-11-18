package com.example.whatsapppractice.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapppractice.adapters.dataclasses.StatusData
import com.example.whatsapppractice.databinding.ChatslistBinding
import com.example.whatsapppractice.databinding.StatusdatalistBinding

class StatusAdapter : RecyclerView.Adapter<StatusAdapter.ViewHolder>() {


    var data: List<StatusData> = emptyList()

    class ViewHolder(val binding: StatusdatalistBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(
          StatusdatalistBinding.inflate(LayoutInflater.from(parent.context,),parent,false)
      )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = data[position]

        holder.binding.apply {

            statusImage.setImageDrawable(item.statusImage)
            statusName.text = item.statusNameText
            statusSubName.text = item.statusSubText
        }


    }

    override fun getItemCount(): Int {
        return data.size
    }

}