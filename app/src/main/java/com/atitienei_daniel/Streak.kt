package com.atitienei_daniel

import java.time.LocalDate

data class StreakData(
    val startDate: LocalDate,
    val endDate: LocalDate,
    val currentStreak: Int
)