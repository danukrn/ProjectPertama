package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    var _binding: FragmentSecondBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listOrangPsikopat = ArrayList<OrangPsikopat>()
        val adapterOrangPsikopat = context?.let { AdapterOrangPsikopat(listOrangPsikopat, it) }
        val llm = LinearLayoutManager(context)
        binding.recyclerView.apply {
            layoutManager = llm
            adapter = adapterOrangPsikopat
        }

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        binding.buttonTambah.setOnClickListener {
            val nama = binding.textInputLayoutNama.editText?.text.toString()
            val umur = binding.textInputLayoutUmur.editText?.text.toString()

            listOrangPsikopat.add(OrangPsikopat(nama,umur))
            adapterOrangPsikopat?.notifyDataSetChanged()

            Toast.makeText(context,"hmmmm",Toast.LENGTH_SHORT).show()
        }


    }
}