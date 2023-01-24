package com.example.circularanimationtask.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.circularanimationtask.common.DataUtil
import com.example.circularanimationtask.databinding.FragmentNotificationsBinding
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.utils.ColorTemplate

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val dataSet = PieDataSet(DataUtil.dummyEntries, "Section")
        val dataSet2 = PieDataSet(DataUtil.firstSectionEntries, "Area")

        dataSet.colors = DataUtil.colorCombinations
        dataSet2.colors = ColorTemplate.MATERIAL_COLORS.toMutableList()
        val data = PieData(dataSet)
        val data2 = PieData(dataSet2)


        binding.pieChart.data = data
        binding.pieChart2.data = data2
        binding.pieChart.animateY(1000)
        binding.pieChart2.animateY(700)
        binding.pieChart.data.setDrawValues(false)
        binding.pieChart2.data.setDrawValues(false)
//        binding.pieChart.setDrawEntryLabels(true)
        binding.pieChart2.setDrawEntryLabels(false)

        binding.pieChart.setDrawCenterText(false)
        binding.pieChart.setDrawMarkers(false)
        binding.pieChart.description.isEnabled = false
        binding.pieChart.legend.isEnabled = false

        binding.pieChart2.setDrawCenterText(false)
        binding.pieChart2.setDrawMarkers(false)
        binding.pieChart2.description.isEnabled = false
        binding.pieChart2.legend.isEnabled = false

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}