package com.example.m3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m3_7.databinding.ItemSongBinding

class SongAdapter (private var songs: List<Song>) :RecyclerView.Adapter<SongAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recentSong = songs[position]
        holder.bind(recentSong)
    }

    class ViewHolder(private val binding: ItemSongBinding) :RecyclerView.ViewHolder(binding.root) {
        fun bind (song: Song){
            binding.tvNum.text = (adapterPosition + 1).toString()
            binding.tvSongName.text = song.name
            binding.tvArtistRv.text = song.artist
            binding.tvTime.text = song.time
        }
    }
}