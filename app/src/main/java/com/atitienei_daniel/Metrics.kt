@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterialApi::class)

package com.atitienei_daniel

import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.atitienei_daniel.reeme.ui.screens.reminders.RemindersListViewModel

@Composable
fun MetricsScreen(
    viewModel: RemindersListViewModel = hiltViewModel(),
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(64.dp),

        ) {
        val state = viewModel.reminders.collectAsState(initial = emptyList()).value
        val completedReminders = state.filter { reminder -> reminder.isDone }
        val total = state.size
        val complete = completedReminders.size
        val upcomingReminders = state.filter { reminder -> reminder.isDone.not() }
        var adherence = if (total != 0) complete.toFloat() / total.toFloat() else 0f
        adherence *= 100


        Text(text = "Analytics")
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            if (adherence.toInt() == 100) {
                Text(text = "Your Adherence today is: ${adherence.toInt()}, High adherence leads to undetected virus load", style = TextStyle(color = Color.Green))
            } else if (adherence.toInt() in 80..99) {
                Text(text = "Your Adherence today is: ${adherence.toInt()}, keep on track", style = TextStyle(color = Color.Blue))
            } else {
                Text(text = "Your Adherence today is: ${adherence.toInt()}, low adherence rate leads to HIV resistance", style = TextStyle(color = Color.Red))
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MetricsScreen()
}