package com.example.recetario.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.recetario.R

// Define la fuente personalizada
val CustomFontFamily = FontFamily(
    Font(R.font.custom_font_regular, FontWeight.Normal),
    Font(R.font.custom_font_bold, FontWeight.Bold)
)

// Define la tipografía con la fuente personalizada
val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp // Ajusta el tamaño según tu necesidad
    ),
    titleLarge = TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp // Ajusta el tamaño según tu necesidad
    ),
    bodyLarge = TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp // Ajusta el tamaño según tu necesidad
    ),
    // Define otros estilos de texto según tu necesidad
)
