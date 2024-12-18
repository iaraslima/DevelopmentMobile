package com.example.nighteventsapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nighteventsapp.models.eventList
import androidx.compose.foundation.layout.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


@Composable
fun EventDetailsScreen(eventId: String?){
    //uso da lista atualizada
    val event = eventList.find{ it.id.toString() == eventId}
    event?.let{
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ){
            Column(modifier = Modifier.padding(16.dp)) {
                //exibe a imagem do evento
                Image(
                    painter = painterResource(id = it.imageRes),
                    contentDescription = "Imagem do evento",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Spacer (modifier = Modifier.height(16.dp))

                //exibição da descrição do evento
                Text(
                    text = it.description,
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer (modifier = Modifier.height(16.dp))

                //exibição da data e localização do evento
                Text(
                    text = "Local: ${it.date}",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Local: ${it.location}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
    }
    } ?: run {
        //exibição de mensagem se o evento não for encontrado
        Text(
            text = "Evento não encontrado",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}