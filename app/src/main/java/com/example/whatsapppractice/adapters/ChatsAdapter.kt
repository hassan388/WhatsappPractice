package com.example.whatsapppractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.contentValuesOf
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapppractice.R
import com.example.whatsapppractice.adapters.dataclasses.ChatsData
import com.example.whatsapppractice.adapters.dataclasses.NewText
import com.example.whatsapppractice.databinding.ActivityMainBinding
import com.example.whatsapppractice.databinding.ChatslistBinding
import kotlinx.coroutines.processNextEventInCurrentThread

class ChatsAdapter(private val data: List<ChatsData>) :
    RecyclerView.Adapter<ChatsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsAdapter.ViewHolder {


        return ViewHolder(
            ChatslistBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(val binding: ChatslistBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = data[position]

        holder.binding.apply {

            chatsChatNameTextView.text = items.chatName
            chatsLastTexttextView.text = items.chatLastText
            chatsLastSeentextView.text = items.chatLastSeen
            chatsUserImage.setImageDrawable(items.chatImage)
            when (items.newText) {

                NewText.True -> {
                    chatsUnreadMessage.text = items.unReadMessage.toString()
                }

                NewText.False -> {
                                chatsUnreadMessage.isVisible = false
                }
            }
        }
    }


}


