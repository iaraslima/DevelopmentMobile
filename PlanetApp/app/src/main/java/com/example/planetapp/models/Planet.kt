package com.example.planetapp.models

import com.example.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)
val planetList = listOf(
    Planet(
        id = 1,
        name = "Terra",
        type = "Terrestrial",
        galaxy = "Via Láctea",
        distanceFromSun = "149.6 milhões de km",
        diameter = "12.742 km",
        characteristics = "Suporta vida, possui água e atmosfera.",
        imageRes = R.drawable.terra
    ),
    Planet(
        id = 2,
        name = "Vênus",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "108,2 milhões de km",
        diameter = "12.104 km",
        characteristics = "Planeta mais quente, atmosfera densa, rota em sentido contrário.",
        imageRes = R.drawable.venus
    ),
    Planet(
        id = 3,
        name = "Mercúrio",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "57,9 milhões de km",
        diameter = "4.879 km",
        characteristics = "Menor planeta, mais próximo do Sol, sem luas.",
        imageRes = R.drawable.mercurio
    ),
    Planet(
        id = 4,
        name = "Marte",
        type = "Terrestre",
        galaxy = "Via Láctea",
        distanceFromSun = "227,9 milhões de km",
        diameter = "6.779 km",
        characteristics = "Conhecido como Planeta Vermelho, possui o maior vulcão do Sistema Solar.",
        imageRes = R.drawable.marte
    ),
    Planet(
        id = 5,
        name = "Júpiter",
        type = "Gigante Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "778,3 milhões de km",
        diameter = "139.820 km",
        characteristics = "Maior planeta, possui a Grande Mancha Vermelha, dezenas de luas.",
        imageRes = R.drawable.jupiter
    ),
    Planet(
        id = 6,
        name = "Saturno",
        type = "Gigante Gasoso",
        galaxy = "Via Láctea",
        distanceFromSun = "1,4 bilhão de km",
        diameter = "116.460 km",
        characteristics = "Conhecido por seus anéis, mais de 80 luas.",
        imageRes = R.drawable.saturno
    ),
    Planet(
        id = 7,
        name = "Urano",
        type = "Gigante de Gelo",
        galaxy = "Via Láctea",
        distanceFromSun = "2,9 bilhões de km",
        diameter = "50.724 km",
        characteristics = "Gira de lado, cor azulada devido ao metano.",
        imageRes = R.drawable.urano
    ),
    Planet(
        id = 8,
        name = "Netuno",
        type = "Gigante de Gelo",
        galaxy = "Via Láctea",
        distanceFromSun = "4,5 bilhões de km",
        diameter = "49.244 km",
        characteristics = "Planeta mais distante, possui os ventos mais rápidos do Sistema Solar.",
        imageRes = R.drawable.netuno
    ),
    Planet(
        id = 9,
        name = "Plutão",
        type = "Planeta Anão",
        galaxy = "Via Láctea",
        distanceFromSun = "5,9 bilhões de km",
        diameter = "2.377 km",
        characteristics = "O menor, gelado, reclassificado como planeta anão em 2006.",
        imageRes = R.drawable.plutao
    )
)

