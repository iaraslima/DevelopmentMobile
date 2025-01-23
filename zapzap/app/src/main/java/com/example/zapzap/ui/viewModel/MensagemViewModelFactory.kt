package com.example.zapzap.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.zapzap.repository.MensagemRepository

class MensagemViewModelFactory(private val repository: MensagemRepository): ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass: Class<T>): T{
        if(modelClass
                .isAssignableFrom(MensagemViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return MensagemViewModel(repository) as T
        }
        throw IllegalArgumentException("o view model class ilegal no escopo do projeto")
    }
}