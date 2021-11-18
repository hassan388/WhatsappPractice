package com.example.whatsapppractice.adapters.dataclasses

import android.graphics.drawable.Drawable

data class CallsData(
    val callsImage: Drawable?,
    val callsName: String,
    val callsLastSeen: String,
    val callType :CallType
)

enum class CallType{

    MissedCall,
    ReceivedCall,
    OutgoingCall
}
