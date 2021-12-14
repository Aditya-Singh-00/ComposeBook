package com.aditya.composebook.gmail.data

import com.aditya.composebook.gmail.R
import com.aditya.composebook.gmail.model.Account
import com.aditya.composebook.gmail.model.Mail
import com.aditya.composebook.gmail.model.MessageBody

val mail = Mail(
    from = Account(
        name = "Google",
        email = "google.gmail.com",
        profile = R.drawable.google
    ),
    to = Account(
        name = "Person",
        email = "person.gmail.com",
        profile = R.drawable.profile
    ),
    subject = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
    body = MessageBody(
        message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum.",
        attachments = listOf(
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
        )
    ),
    time = "8:57 AM"
)

val mails = listOf(
    mail,
    mail.copy(
        from = Account(
            name = "Amazon",
            email = "amazon.gmail.com",
            profile = R.drawable.amazon)
    ),
    mail.copy(
        from = Account(
            name = "Apple",
            email = "apple.gmail.com",
            profile = R.drawable.apple
        )
    ),
    mail.copy(
        from = Account(
            name = "Facebook",
            email = "facebook.gmail.com",
            profile = R.drawable.facebook
        )
    ),
    mail.copy(
        from = Account(
            name = "Gmail",
            email = "gmail.gmail.com",
            profile = R.drawable.gmail
        )
    ),
    mail.copy(
        from = Account(
            name = "JetBrains",
            email = "jetbrains.gmail.com",
            profile = R.drawable.jetbrains
        )
    ),
    mail.copy(
        from = Account(
            name = "Kotlin",
            email = "kotlin.gmail.com",
            profile = R.drawable.kotlin
        )
    ),
    mail.copy(
        from = Account(
            name = "Netflix",
            email = "netflix.gmail.com",
            profile = R.drawable.netflix
        )
    ),
    mail.copy(
        from = Account(
            name = "Twitter",
            email = "twitter.gmail.com",
            profile = R.drawable.twitter
        )
    ),
    mail.copy(
        from = Account(
            name = "YouTube",
            email = "youtube.gmail.com",
            profile = R.drawable.youtube
        )
    )
)
