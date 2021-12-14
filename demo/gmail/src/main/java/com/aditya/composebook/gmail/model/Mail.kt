package com.aditya.composebook.gmail.model

data class Mail(
    val from: Account,
    val to: Account,
    val subject: String,
    val body: MessageBody,
    val time: String,
)

data class Account(
    val name: String,
    val email: String,
    val profile: Int
)

data class MessageBody(
    val message: String,
    val attachments: List<Int> = emptyList()
)
