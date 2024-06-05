package com.example.m3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m3_7.databinding.FragmentSongsBinding

class SongsFragment : Fragment() {
    private lateinit var binding: FragmentSongsBinding
    private lateinit var adapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val songs = listOf<Song>(
            Song("Uzaktan", "Goksel","3:03"),
            Song("Garezim var", "Kahraman","3:00"),
            Song("Belki", "Dedubluman","2:23"),
            Song("Lovely", "Billie Eilish","2:45"),
            Song("Askin olyim", "Simge","2:50"),
            Song("Mosty", "Rauf","3:10"),
            Song("Control", "Miyagi","3:18"),
            Song("5 minute", "Rauf","2:20"),
            Song("Huyu suyu", "BlockB","2:05"),
            Song("Hoscakal", "Emre Aydin","2:06"),
            Song("RAFA", "Deeprise","2:15"))
        adapter = SongAdapter(songs)
        binding.rvSongs.adapter = adapter
    }
}