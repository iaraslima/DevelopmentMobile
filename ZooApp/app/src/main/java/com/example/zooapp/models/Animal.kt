package com.example.zooapp.models

import com.example.zooapp.R

data class Animal (
    val id: Int,
    val name: String,
    val translate: String,
    val imageRes: Int,
    val description: String,
    val life: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Avestruz",
        translate = "Avestruz/Ostrich",
        imageRes = R.drawable.avestruz,
        description = "O avestruz é o único pássaro com dois dedos e podem sobreviver vários dias sem beber água",
        life = "Vivem livres de 30 a 40 anos e 70 anos em cativeiro"
    ),
    Animal(
        id = 2,
        name = "Baleia",
        translate = "Baleia/Whale",
        imageRes = R.drawable.baleia,
        description = "Alimentam-se principalmente de pequenos organismos, como pequenos crustáceos e possuem um excelente senso de audição e um sistema de ecolocalização altamente sofisticado",
        life = "Dependendo da espécie, sua vida pode variar de 45 a 210 anos"
    ),
    Animal(
        id = 3,
        name = "Canguru",
        translate = "Canguru/kangaroo",
        imageRes = R.drawable.canguru,
        description = "Gostam de viajar em grupos, são rápidos e possuem o marsúpio, uma bolsa onde o filhote finaliza seu desenvolvimento",
        life = "Vivem livres de 8 a 16 anos e 25 a 27 anos em cativeiro"
    ),
    Animal(
        id = 4,
        name = "Dromedário",
        translate = "Dromedário/Dromedary",
        imageRes = R.drawable.dromedario,
        description = "Possui uma corcova, que é composta de gordura, servindo como reserva energética ao animal",
        life = "Vivem de 40 a 50 anos"
    ),
    Animal(
        id = 5,
        name = "Esquilo",
        translate = "Esquilo/Squirrel",
        imageRes = R.drawable.esquilo,
        description = "quatro dentes dianteiros desses animais crescem continuamente e são tão potentes que eles conseguem corroer até fios elétricos",
        life = "Dependendo da espécie, sua vida pode variar de 3 a 12 anos"
    ),
    Animal(
        id = 6,
        name = "Foca",
        translate = "Foca/Seal",
        imageRes = R.drawable.foca,
        description = "São mamíferos muito simpáticos que vivem na água e, quando filhotes, possuem pelagem quente",
        life = "As focas fêmeas podem viver de 30 a 35 anos, enquanto que os machos 20 a 25 anos"
    ),
    Animal(
        id = 7,
        name = "Gato",
        translate = "Gato/cat",
        imageRes = R.drawable.gato,
        description = "Podem perceber um terremoto até 15 minutos antes pois são muito sensíveis a sons e vibrações, além de não sentirem o sabor doce",
        life = "Vivem de 13 a 20 anos"
    ),
    Animal(
        id = 8,
        name = "Hipopótamo",
        translate = "Hipopótamo/Hippo",
        imageRes = R.drawable.hipopotamo,
        description = "Os hipopótamos são herbívoros e reconhecem as vozes de seus amigos e inimigos em potencial",
        life = "Vivem de 40 a 50 anos"
    ),
    Animal(
        id = 9,
        name = "Iguana",
        translate = "Iguana/Iguana",
        imageRes = R.drawable.iguana,
        description = "Por serem extremamente dóceis, são os répteis mais criados em cativeiro e podem medir até 1,80 de comprimento",
        life = "Vivem livres, em média, 20 anos e, em média, 15 anos em cativeiro"
    ),
    Animal(
        id = 10,
        name = "Jacaré",
        translate = "Jacaré/Alligator",
        imageRes = R.drawable.jacare,
        description = " Não conseguem pôr sua língua para fora da boca nem mastigar alimentos",
        life = "Dependendo da espécie, vivem aproximadamente 50 anos"
    ),
    Animal(
        id = 11,
        name = "Leão",
        translate = "Leão/Lion",
        imageRes = R.drawable.leao,
        description = "Seu rugido é tão poderoso que pode ser ouvido a 8 km de distância, além de poder dar um salto de 10 metros",
        life = "O leão pode viver de 8 a 10 anos"
    ),
    Animal(
        id = 12,
        name = "Macaco",
        translate = "Macaco/Monkey",
        imageRes = R.drawable.macaco,
        description = "lorem ipsum",
        life = "Dependendo da espécie, pode viver até 60 anos"
    ),
    Animal(
        id = 13,
        name = "Nambu",
        translate = "Nambu/Nambu",
        imageRes = R.drawable.nambu,
        description = "Seu ninho é construído no solo e se imobilizam-se rapidamente, além de ficarem quase sempre com o pescoço ereto",
        life = "Pode viver até 16 anos"
    ),
    Animal(
        id = 14,
        name = "Ornitorrinco",
        translate = "Ornitorrinco/Platypus",
        imageRes = R.drawable.ornitorrinco,
        description = "Não possuem estômago e os bebês bebem o leite sulgando do pelo da mãe",
        life = "Pode viver até 17 anos"
    ),
    Animal(
        id = 15,
        name = "Pinguim",
        translate = "Pinguim/Penguin",
        imageRes = R.drawable.pinguim,
        description = "Não possuem dentes e são encontrados apenas no Hemisfério Sul",
        life = "Podem viver até 40 anos vivendo em cativeiro, mas 20 anos livres"
    ),
    Animal(
        id = 16,
        name = "Quati",
        translate = "Quati/Coati",
        imageRes = R.drawable.quati,
        description = "Comunicam-se por meio de sons e gestos das caudas, além disso, os machos adultos costumam ser solitários",
        life = "Podem viver até 17 anos"
    ),
    Animal(
        id = 17,
        name = "Rato",
        translate = "Rato/Mouse",
        imageRes = R.drawable.rato,
        description = "Comunicam-se farejando uns aos outro e os roedores não possuem comportamento agressivo na maioria das vezes",
        life = "Dependendo da espécie, podem viver e 1 a 30 anos"
    ),
    Animal(
        id = 19,
        name = "Sapo",
        translate = "Sapo/Frog",
        imageRes = R.drawable.sapo,
        description = "Têm duas glândulas de veneno na pele, uma atrás de cada olho, que só são ativadas quando apertadas e são controladores naturais de muitas pragas",
        life = "Dependendo da espécie, podem viver até 12 anos"
    ),
    Animal(
        id = 20,
        name = "Tatu",
        translate = "Tatu/armadillo",
        imageRes = R.drawable.tatu,
        description = "Sua carapaça é feita de ossos e algumas espécies são capazes de se fechar como uma bola",
        life = "Dependendo da espécie, podem viver até 22 anos"
    ),
    Animal(
        id = 21,
        name = "Urso",
        translate = "Urso/bear",
        imageRes = R.drawable.urso,
        description = "Os ursos-pardos possuem uma força de mordida de mais de 1.200 PSI - o suficiente para esmagar uma bola de boliche ou uma frigideira de ferro e existem apenas 8 espécies de ursos no mundo",
        life = "Dependendo da espécie, podem viver entre 15 a 47 anos"
    ),
    Animal(
        id = 22,
        name = "Vaca",
        translate = "Vaca/cow",
        imageRes = R.drawable.vaca,
        description = "As vacas usam os olhos e as orelhas para expressar suas emoções, além disso, elas passam até 40% do tempo ruminando",
        life = "Vivem até 25 anos"
    ),
    Animal(
        id = 23,
        name = "Xexéu",
        translate = "Xexéu/Xexeu",
        imageRes = R.drawable.xexeu,
        description = "É capaz de imitar sons de mamíferos e outras aves e gostam de comer manga",
        life = "Não há informação sobre o tempo de vida de uma xexéu"
    ),
    Animal(
        id = 24,
        name = "Zebra",
        translate = "Zebra/Zebra",
        imageRes = R.drawable.zebra,
        description = "São capazes de correr a velocidades de até 56 quilômetros por hora e cada zebra tem um padrão único de listras",
        life = "Vivem em média 20 a 40 anos"
    )

)