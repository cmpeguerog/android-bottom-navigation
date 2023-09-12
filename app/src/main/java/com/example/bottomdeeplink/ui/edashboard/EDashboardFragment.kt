package com.example.bottomdeeplink.ui.edashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomdeeplink.databinding.FragmentEdashboardBinding

class EDashboardFragment : Fragment() {

    private var _binding: FragmentEdashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEdashboardBinding.inflate(inflater, container, false)
        binding.navigate.isEnabled = false
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}