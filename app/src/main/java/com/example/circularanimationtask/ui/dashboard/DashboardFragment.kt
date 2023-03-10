package com.example.circularanimationtask.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.circularanimationtask.common.DataUtil
import com.example.circularanimationtask.databinding.FragmentDashboardBinding
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.utils.ColorTemplate

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val dataSet = PieDataSet(DataUtil.dummyEntries, "Sections")

        dataSet.colors = ColorTemplate.MATERIAL_COLORS.toMutableList()
        val data = PieData(dataSet)

        binding.pieChart.data = data
        binding.pieChart.data.setDrawValues(false)
        binding.pieChart.setDrawCenterText(false)
        binding.pieChart.setDrawMarkers(false)
        binding.pieChart.description.isEnabled = false
        binding.pieChart.legend.isEnabled = false



        binding.pieChart.animateY(1000)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}