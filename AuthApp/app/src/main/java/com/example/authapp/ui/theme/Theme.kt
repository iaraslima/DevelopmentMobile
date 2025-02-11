package com.example.authapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF33ACC5),
    onPrimary =  Color.White,
    secondary = Color(0xFF99BDD9),
    onSecondary = Color.Black,
    surface = Color(0xF5F5F5F5),
    onSurface = Color.Black,
    background = Color(0xBB8188EC),
    onBackground = Color.Black,
    tertiary = Color.Black,
    onTertiary = Color.Black
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xBB8188EC),
    onPrimary = Color.White,
    secondary = Color(0xFF99BEE9),
    onSecondary = Color.Gray,
    tertiary = Color(0xFF88BDD9),
    onTertiary = Color.White,
    background = Color(0xFF99BDD9),
    onBackground = Color.Black,
    surface = Color(0xFFF5F5F5),
    onSurface = Color.Black
)


@Composable
fun AuthAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Desativa cores dinâmicas
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}