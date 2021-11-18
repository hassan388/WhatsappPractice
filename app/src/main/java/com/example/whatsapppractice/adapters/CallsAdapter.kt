package com.example.whatsapppractice.adapters

import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapppractice.R
import com.example.whatsapppractice.adapters.dataclasses.CallType
import com.example.whatsapppractice.adapters.dataclasses.CallsData
import com.example.whatsapppractice.databinding.CalldatalistBinding
import com.example.whatsapppractice.databinding.StatusdatalistBinding

class CallsAdapter(private val data :List<CallsData>, val context : Context):RecyclerView.Adapter<CallsAdapter.ViewHolder>() {



    class ViewHolder( val binding: CalldatalistBinding):RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
           CalldatalistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = data[position]
        holder.binding.apply {
            callsNameTV.text = item.callsName
            callsLastCallTV.text = item.callsLastSeen
            callsImageIV.setImageDrawable(item.callsImage)

        }
        when(item.callType){

            CallType.MissedCall-> {
                holder.binding.callTypeImageV.rotation = 130f
                holder.binding.callTypeImageV.imageTintList = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.red) )
            }
            CallType.OutgoingCall->{
                holder.binding.callTypeImageV.rotation = 310f
            }
            CallType.ReceivedCall->{
                holder.binding.callTypeImageV.rotation = 130f
            }
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}