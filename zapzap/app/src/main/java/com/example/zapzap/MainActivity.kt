package com.example.zapzap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Room
import com.example.zapzap.data.local.database.AppDatabase
import com.example.zapzap.repository.MensagemRepository
import com.example.zapzap.ui.theme.ZapzapTheme
import com.example.zapzap.ui.view.MensagemApp
import com.example.zapzap.ui.viewModel.MensagemViewModel
import com.example.zapzap.ui.viewModel.MensagemViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db= Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "messages-db"
        ).fallbackToDestructiveMigration().build()
        val repository = MensagemRepository(db.messageDao())

        setContent {
            ZapzapTheme {
                val viewModel: MensagemViewModel = viewModel(
                    factory = MensagemViewModelFactory(repository)
                )
            MensagemApp(viewModel)
            }
        }
    }
}
