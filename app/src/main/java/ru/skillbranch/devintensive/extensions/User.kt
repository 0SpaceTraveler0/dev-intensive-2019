package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Utils
//проверка

fun User.toUserView(): UserView {

    val nickName = Utils.translititeration("$firstName $lastName")
    val initials =  Utils.tiInitials(firstName,lastName)
    val status = if (lastVisit==null) "Ещё не разу не был" else if (isOnline) "online" else "Последний раз был ${lastVisit.humanizeDiff()}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        initials = initials,
        avatar = avatar,
        status = status)
}




