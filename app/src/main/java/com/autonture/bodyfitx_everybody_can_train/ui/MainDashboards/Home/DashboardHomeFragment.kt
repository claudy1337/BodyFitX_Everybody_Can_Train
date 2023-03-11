package com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.autonture.bodyfitx_everybody_can_train.databinding.FragmentDashboardHomeBinding


class DashboardHomeFragment : Fragment() {

    private var _binding: FragmentDashboardHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val dashboardHomeViewModel =
            ViewModelProvider(this).get(DashboardHomeViewModel::class.java)

        _binding = FragmentDashboardHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView16
        dashboardHomeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}