package com.example.circularanimationtask.common

import com.github.mikephil.charting.data.PieEntry

object DataUtil {
    val entries = listOf<PieEntry>(
        PieEntry(25f, "Section 1"),
        PieEntry(35f, "Section 2"),
        PieEntry(10f, "Section 3"),
        PieEntry(30f, "Section 4"),
        PieEntry(20f, "Section 5"),
        PieEntry(15f,"Section 6"),
        PieEntry(5f,"Section 7")
    )
}