package com.example.whatsapppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.example.whatsapppractice.adapters.ViewPagerAdapter
import com.example.whatsapppractice.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = binding.tabLayout
        val viewpager = binding.viewPager


        val adapter = ViewPagerAdapter(fragPosition = arrayListOf(
            FirstFragment(),SecondFragment(),ThirdFragment()
        ),supportFragmentManager,lifecycle)

        viewpager.adapter = adapter

        TabLayoutMediator(tabLayout,viewpager){tab,position->
            var first = 0
            var Second = 1

            when(position){
                0->{
                    tab.text ="CHATS"
                    //tab.icon = getDrawable(R.drawable.ic_baseline_chat_24)
                }
                1-> {
                    tab.text ="STATUS"
                    //tab.icon = getDrawable(R.drawable.ic_baseline_photo_camera_24)

                }
                2-> {
                    tab.text ="CALLS"
                   // tab.icon= getDrawable(R.drawable.ic_baseline_add_ic_call_24)
                    }

            }


        }.attach()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menuformain, menu)
        return super.onCreateOptionsMenu(menu)
    }
}