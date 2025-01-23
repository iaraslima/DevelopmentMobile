package com.example.zapzap.repository

import com.example.zapzap.data.local.dao.MensagemDao
import com.example.zapzap.model.Mensagem
import kotlinx.coroutines.flow.Flow

class MensagemRepository(private val dao: MensagemDao) {
    val allMessages: Flow<List<Mensagem>> = dao.getAllMessages()

    suspend fun addMessage(content: String){
        val message = Mensagem(content = content, timestamp = System.currentTimeMillis())

        dao.insertMessage(message)
    }
}