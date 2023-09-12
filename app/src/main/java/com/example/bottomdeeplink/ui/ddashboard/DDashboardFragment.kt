package com.example.bottomdeeplink.ui.ddashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomdeeplink.R
import com.example.bottomdeeplink.databinding.FragmentDdashboardBinding

class DDashboardFragment : Fragment() {

    private var _binding: FragmentDdashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDdashboardBinding.inflate(inflater, container, false)
        val root = binding.root
        binding.navigate.setOnClickListener {
            findNavController().navigate(R.id.action_ddashboard_to_edashboard)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}