package com.example.zapzap.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zapzap.model.Mensagem
import com.example.zapzap.repository.MensagemRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MensagemViewModel (private val repository: MensagemRepository): ViewModel(){
    private val _messages = MutableStateFlow<List<Mensagem>>(emptyList())

    val message : StateFlow<List<Mensagem>> = _messages.asStateFlow()

    init{
        viewModelScope.launch{
            repository.allMessages.collect{_messages.value = it}
        }
    }

    fun addMensagem(content: String){
        viewModelScope.launch{
            val newMensagem = Mensagem(content = content, timestamp = System.currentTimeMillis())
            _messages.value = _messages.value + newMensagem
            repository.addMessage(content)
        }
    }
}