package com.example.bottomdeeplink.ui.chome

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomdeeplink.databinding.FragmentChomeBinding

class CHomeFragment : Fragment() {

    private var _binding: FragmentChomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChomeBinding.inflate(inflater, container, false)
        val root = binding.root
        binding.navigate.setOnClickListener {
            findNavController().navigate(deepLink = Uri.parse("https://test.com"))
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}