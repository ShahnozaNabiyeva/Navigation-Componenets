package com.shahnoza.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shahnoza.navigationcomponents.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {



lateinit var binding: FragmentSecondBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentSecondBinding.inflate(layoutInflater)


        var malumot=arguments?.getString("key")
        binding.myTextView.text=malumot


        binding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.finishFragment)
        }


        return binding.root
    }


}