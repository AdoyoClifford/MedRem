package com.atitienei_daniel.reeme.ui.utils.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Repeat
import androidx.compose.runtime.Composable
import com.atitienei_daniel.reeme.ui.screens.create_reminder.OutlinedPicker
import com.atitienei_daniel.reeme.ui.utils.enums.ReminderRepeatTypes

@Composable
fun RepeatDropdown(
    repeat: ReminderRepeatTypes,
    onRepeatValueChange: (ReminderRepeatTypes) -> Unit,
    showRepeatDropdownMenu: Boolean,
    toggleDropDown: (Boolean) -> Unit
) {
    Column {
        OutlinedPicker(
            value = when (repeat) {
                ReminderRepeatTypes.ONCE -> "Once"
                ReminderRepeatTypes.TWICE -> "Twice"
                ReminderRepeatTypes.THRICE -> "Thrice"
                ReminderRepeatTypes.FOURFOLD -> "Fourfold"
               // ReminderRepeatTypes.YEARLY -> "Yearly"
                else -> ""
            },
            placeholder = "Repeat",
            trailingIcon = Icons.Outlined.Repeat,
            onClick = { toggleDropDown(true) }
        )

        DropdownMenu(
            expanded = showRepeatDropdownMenu,
            onDismissRequest = { toggleDropDown(false) }
        ) {
            DropdownMenuItem(onClick = {
                onRepeatValueChange(ReminderRepeatTypes.UNSELECTED)
                toggleDropDown(false)
            }) {
                Text(text = "Remove")
            }

            DropdownMenuItem(onClick = {
                onRepeatValueChange(ReminderRepeatTypes.ONCE)
                toggleDropDown(false)
            }) {
                Text(text = "Once")
            }

            DropdownMenuItem(onClick = {
                onRepeatValueChange(ReminderRepeatTypes.TWICE)
                toggleDropDown(false)
            }) {
                Text(text = "Twice")
            }

            DropdownMenuItem(onClick = {
                onRepeatValueChange(ReminderRepeatTypes.THRICE)
                toggleDropDown(false)
            }) {
                Text(text = "Thrice")
            }

            DropdownMenuItem(onClick = {
                onRepeatValueChange(ReminderRepeatTypes.FOURFOLD)
                toggleDropDown(false)
            }) {
                Text(text = "FourFold")
            }

//            DropdownMenuItem(onClick = {
//                onRepeatValueChange(ReminderRepeatTypes.YEARLY)
//                toggleDropDown(false)
//            }) {
//                Text(text = "Yearly")
//            }
        }
    }
}
