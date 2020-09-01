package ru.skillbranch.devintensive.utils

object Utils {
    //TO DO FIX ME COMPLETE
    fun parseFullName(fullName:String?):Pair<String?,String?>{
        var parts: List<String>? = fullName?.split(" ")?.filter { it.isNotBlank() }
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        return Pair(firstName,lastName) // или firstname to lastname
    }

    fun translititeration(payload: String, divider:String = ""): String {
    // TODO: 25.08.2020
        return ""
    }

    fun tiInitials(firstName: String?, lastName: String?): String? {
        // TODO: 25.08.2020
        return ""
    }
}