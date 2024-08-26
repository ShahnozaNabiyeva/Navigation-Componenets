package com.shahnoza.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.shahnoza.navigationcomponents.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding=FragmentFirstBinding.inflate(layoutInflater)

        val navOption= NavOptions.Builder()
        navOption.setEnterAnim(R.anim.enter_anim)
        navOption.setExitAnim(R.anim.exit_anim)
        navOption.setPopEnterAnim(R.anim.pop_enter_anim)
        navOption.setPopExitAnim(R.anim.pop_exit_anim)

        binding.btnNext.setOnClickListener {
            val ism=binding.edtName.text.toString().trim()
            findNavController().navigate(R.id.secondFragment, bundleOf("key" to ism),navOption.build())
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


}