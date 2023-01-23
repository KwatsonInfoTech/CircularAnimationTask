package com.example.circularanimationtask.common

import android.graphics.Color
import com.github.mikephil.charting.data.PieEntry

object DataUtil {
    val dummyEntries = listOf<PieEntry>(
        PieEntry(25f, "Rodger"),
        PieEntry(35f, "Tony"),
        PieEntry(10f, "Hank"),
        PieEntry(30f, "Walter"),
        PieEntry(20f, "Pinkman"),
        PieEntry(15f, "Tuco"),
        PieEntry(5f, "Gus")
    )
    val firstSectionEntries = listOf<PieEntry>(
        PieEntry(25f, "Area 1"),
        PieEntry(10f, "Area 3"),
        PieEntry(30f, "Area 4"),
        PieEntry(15f, "Area 6"),
        PieEntry(5f, "Area 7")
    )

    val colorCombinations = listOf<Int>(
        Color.rgb(193, 37, 82),
        Color.rgb(1, 135, 134),
        Color.rgb(245, 199, 0),
        Color.rgb(106, 150, 31),
        Color.rgb(98, 0, 238)
    )


}