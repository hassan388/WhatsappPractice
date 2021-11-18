package com.example.whatsapppractice

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapppractice.adapters.CallsAdapter
import com.example.whatsapppractice.adapters.dataclasses.CallType
import com.example.whatsapppractice.adapters.dataclasses.CallsData
import com.example.whatsapppractice.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {
    private  lateinit var binding:FragmentThirdBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)



        binding.RecycleVCalls.layoutManager = LinearLayoutManager(requireContext())

        val data = mutableListOf(
            CallsData(AppCompatResources.getDrawable(requireContext(),R.drawable.wallpaperflarecomwallpaper),"Ali ","5 hours ago",CallType.MissedCall),
            CallsData(AppCompatResources.getDrawable(requireContext(),R.drawable.wallpaperflarecomwallpaper10),"UMEr","Now",CallType.ReceivedCall),
            CallsData(AppCompatResources.getDrawable(requireContext(),R.drawable.wallpaperflarecomwallpaper4),"ZAID ","3 Months ago",CallType.OutgoingCall),

        )

        val adapter = CallsAdapter(data,requireContext())
        binding.RecycleVCalls.adapter = adapter









    }




}