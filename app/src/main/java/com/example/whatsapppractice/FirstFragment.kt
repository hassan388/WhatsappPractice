package com.example.whatsapppractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapppractice.adapters.ChatsAdapter
import com.example.whatsapppractice.adapters.dataclasses.ChatsData
import com.example.whatsapppractice.adapters.dataclasses.NewText
import com.example.whatsapppractice.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_first, container, false)




        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)


        binding.RecycleVChats.layoutManager = LinearLayoutManager(requireContext())

        val data = mutableListOf(
            ChatsData(
                "First chat  ",
                "ok",
                "yesterday",
                AppCompatResources.getDrawable(requireContext(), R.drawable.glassesdp),
                NewText.True,11
            ),
            ChatsData(
                "second chat for new group ",
                "bye see you next time ",
                "friday",
                AppCompatResources.getDrawable(requireContext(), R.drawable.thelegendofzelda),
                NewText.False,0
            ),
            ChatsData(
                "All new in Kotlin by android",
                "Ill be there in a jiffi",
                "friday",
                AppCompatResources.getDrawable(requireContext(), R.drawable.rayaa),
                NewText.True,2
            ),
            ChatsData(
                "4th chat is not available",
                "bye for now ",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper
                ),
                NewText.True,4
            ),
            ChatsData(
                "T5th chat all u can get ",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper10
                ),
                NewText.False,0
            ),
            ChatsData(
                "6th chat",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper12
                ),
                NewText.False   ,0
            ),
            ChatsData(
                "7th chat",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper2
                ),
                NewText.True,6
            ),
            ChatsData(
                "7th heklj jsdfsdf chat",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper2
                ),
                NewText.False,0
            ),
            ChatsData(
                "7th chat",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper2
                ),
                NewText.False,0
            ),
            ChatsData(
                "7thchat",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper2
                ),
                NewText.False,0
            ),
            ChatsData(
                "7thchat",
                "bye",
                "friday",
                AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.wallpaperflarecomwallpaper2
                ),
                NewText.False,0
            ),
        )
        val adapter = ChatsAdapter(data)
        binding.RecycleVChats.adapter = adapter

    }


}