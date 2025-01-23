package com.example.zapzap.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.zapzap.data.local.dao.MensagemDao
import com.example.zapzap.model.Mensagem

@Database(entities = [Mensagem::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun messageDao(): MensagemDao

}