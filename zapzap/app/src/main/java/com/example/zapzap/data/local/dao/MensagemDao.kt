package com.example.zapzap.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.zapzap.model.Mensagem
import kotlinx.coroutines.flow.Flow

@Dao
interface MensagemDao {

    @Query("SELECT * FROM mensagens ORDER BY timestamp ASC")
    fun getAllMessages(): Flow<List<Mensagem>>

    @Insert
    suspend fun insertMessage(mensagem: Mensagem)

}