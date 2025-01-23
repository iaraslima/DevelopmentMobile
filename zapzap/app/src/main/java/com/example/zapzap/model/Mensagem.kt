package com.example.zapzap.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mensagens")
data class Mensagem(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val content: String,
    val timestamp: Long,

)