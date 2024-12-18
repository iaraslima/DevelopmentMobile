package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id= 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em Tecnologia",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id= 2,
        title = "Conferência de Astronomia",
        description = "Será que o Mundo vai acabar?",
        date = "2024-12-30",
        location = "Auditório da Universidade Cachoeirinha",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id= 1,
        title = "Cuide do seu melhor amigo",
        description = "A importância de uma rotina saudável para os animais",
        date = "2025-10-12",
        location = "Praça da Catedral",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    )
)