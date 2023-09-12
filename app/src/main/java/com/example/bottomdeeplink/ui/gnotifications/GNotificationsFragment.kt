package com.example.bottomdeeplink.ui.gnotifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomdeeplink.databinding.FragmentGnotificationsBinding

class GNotificationsFragment : Fragment() {

    private var _binding: FragmentGnotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGnotificationsBinding.inflate(inflater, container, false)
        binding.navigate.isEnabled = false
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}