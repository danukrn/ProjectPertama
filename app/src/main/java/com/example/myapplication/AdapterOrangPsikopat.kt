package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ListOrangPsikopatBinding

class AdapterOrangPsikopat(val listOrangPsikopat: ArrayList<OrangPsikopat>,
                           val context: Context
): RecyclerView.Adapter<AdapterOrangPsikopat.viewHolderOrangPsico>() {

    class viewHolderOrangPsico(val binding: ListOrangPsikopatBinding) : RecyclerView.ViewHolder(binding.root){
        init {
            binding.root.setOnClickListener {
                Toast.makeText(binding.root.context,"lol",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolderOrangPsico {
        //TODO("Not yet implemented")
        val view = ListOrangPsikopatBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewHolderOrangPsico(ListOrangPsikopatBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return listOrangPsikopat.size
    }

    override fun onBindViewHolder(holder: viewHolderOrangPsico, position: Int) {
        //TODO("Not yet implemented")
        holder.binding.apply {
            textViewNama.text = listOrangPsikopat[position].nama
            textViewUmur.text = listOrangPsikopat[position].umur
        }
    }


}