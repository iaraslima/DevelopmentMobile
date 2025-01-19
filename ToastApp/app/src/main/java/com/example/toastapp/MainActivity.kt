package com.example.toastapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.example.toastapp.ui.theme.ToastAppTheme
import com.example.toastapp.ui.screens.PostScreen // Tela de posts
import com.example.toastapp.ui.screens.UserScreen // Tela de usuários

// Classe principal da atividade
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToastAppTheme{MainScreen()} // Configura a tela principal da aplicação}
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter") // Suprime aviso sobre padding padrão não utilizado
@Composable
fun MainScreen() {
    // Estado para controlar qual aba está selecionada (0 para "Usuários", 1 para "Posts")
    var selectedTab by remember { mutableStateOf(0) }

    // Scaffold é um layout que fornece uma estrutura básica para a tela, com barra superior e inferior
    Scaffold(
        // Barra superior com título
        topBar = {
            TopAppBar(
                title = { Text("brinde") }, // Título exibido na barra superior
                backgroundColor = Color.White, // Cor de fundo
                contentColor = MaterialTheme.colors.primarySurface // Cor do texto e ícones
            )
        },
        // Barra de navegação inferior
        bottomBar = {
            BottomNavigation {
                // Item de navegação para a tela de usuários
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Usuários") }, // Ícone de pessoa
                    label = { Text("Usuários") }, // Rótulo "Usuários"
                    selected = selectedTab == 0, // Define se este item está selecionado
                    onClick = { selectedTab = 0 } // Altera o estado para a aba de "Usuários"
                )
                // Item de navegação para a tela de posts
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.List, contentDescription = "Posts") }, // Ícone de lista
                    label = { Text("Brindes") }, // Rótulo "Posts"
                    selected = selectedTab == 1, // Define se este item está selecionado
                    onClick = { selectedTab = 1 } // Altera o estado para a aba de "Posts"
                )
            }
        }
    ) {
        // Exibe a tela correspondente com base na aba selecionada
        when (selectedTab) {
            0 -> UserScreen() // Tela de usuários
            1 -> PostScreen() // Tela de posts
        }
    }
}
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.toastapp.ui.theme.ToastAppTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            ToastAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ToastAppTheme {
//        Greeting("Android")
//    }
//}