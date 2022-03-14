package com.example.androidnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.androidnavigationcomponent.databinding.FragmentSingleBinding

class SingleFragment : Fragment() {
    private var _binding: FragmentSingleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentSingleBinding.inflate(inflater, container, false)

        binding.hClick.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_singleFragment_to_doubleFragment)

        }

        return binding.root

    }

}