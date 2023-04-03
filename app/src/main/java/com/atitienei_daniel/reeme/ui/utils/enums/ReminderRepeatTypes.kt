package com.atitienei_daniel.reeme.ui.utils.enums

enum class ReminderRepeatTypes {
    ONCE,
    TWICE,
    THRICE,
    FOURFOLD,
   // YEARLY,
    UNSELECTED
}

fun ReminderRepeatTypes.toString(reminderRepeatTypes: ReminderRepeatTypes) =
    when (reminderRepeatTypes) {
        ReminderRepeatTypes.ONCE -> "Once"
        ReminderRepeatTypes.TWICE -> "Twice"
        ReminderRepeatTypes.THRICE -> "Thrice"
        ReminderRepeatTypes.FOURFOLD -> "Fourfold"
       // ReminderRepeatTypes.YEARLY -> "Yearly"
        else -> ""
    }
