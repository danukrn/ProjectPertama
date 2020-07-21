package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ListOrangPsikopatBinding

class AdapterOrangPsikopat(val listOrangPsikopat: ArrayList<OrangPsikopat>,
                           val context: Context
): RecyclerView.Adapter<AdapterOrangPsikopat.viewHolder>() {

    class viewHolder(val binding: ListOrangPsikopatBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        //TODO("Not yet implemented")
        return viewHolder(ListOrangPsikopatBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return listOrangPsikopat.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        //TODO("Not yet implemented")
        with(holder.binding){
            textViewNama.text = listOrangPsikopat[position].nama
            textViewUmur.text = listOrangPsikopat[position].umur.toString()
        }
    }


}