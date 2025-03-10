package com.example.authapp.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.example.authapp.viewmodel.AuthViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.request.ImageRequest

@Composable
fun HomeScreen(viewModel: AuthViewModel, navController: NavController) {
    var userName by remember { mutableStateOf("Identificando Usuário...") }
    var isVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        viewModel.getUserName { name ->
            userName = name ?: "Usuário"
        }
        isVisible = true
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        AnimatedVisibility(
            visible = isVisible,
            enter = slideInVertically(initialOffsetY = { -50 }) + fadeIn()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Oi, $userName!",
                    fontSize = 28.sp,
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 24.dp)
                )

                val context = LocalContext.current
                val imageLoader = remember {
                    ImageLoader.Builder(context)
                        .components { add(GifDecoder.Factory()) }
                        .build()
                }

                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://usagif.com/wp-content/uploads/cat-typing-21.gif")
                        .crossfade(true)
                        .build(),
                    contentDescription = "GIF animado",
                    imageLoader = imageLoader,
                    modifier = Modifier.size(120.dp)
                )

                Button(
                    onClick = {
                        viewModel.logout()
                        navController.navigate("login")
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text("Sair", fontSize = 18.sp, color = MaterialTheme.colorScheme.onPrimary)
                }
            }
        }
    }
}
