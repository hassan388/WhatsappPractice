package com.example.whatsapppractice.adapters.dataclasses

import android.graphics.drawable.Drawable


data class ChatsData(

    val chatName: String,
    val chatLastText: String,
    val chatLastSeen: String,
    val chatImage: Drawable?,
    val newText: NewText,
    val unReadMessage: Int?


    )
enum class NewText{

    True,
    False
}


