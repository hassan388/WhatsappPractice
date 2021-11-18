package com.example.whatsapppractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapppractice.adapters.StatusAdapter
import com.example.whatsapppractice.adapters.dataclasses.StatusData
import com.example.whatsapppractice.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {
        private lateinit var binding: FragmentSecondBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)


        binding.RecycleVStatus.layoutManager = LinearLayoutManager(requireContext())


        val data = mutableListOf(

            StatusData(AppCompatResources.getDrawable(requireContext(),R.drawable.rayaa),"MY Status","Add Status",)
        )

        val adapter = StatusAdapter()
         adapter.data = data
        binding.RecycleVStatus.adapter = adapter

    }




}