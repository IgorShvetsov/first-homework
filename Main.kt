package com.example.myapplication

import kotlin.reflect.full.memberProperties

fun main() {
    val wolf = Carnivores(
        "Млекопитающие", "Хищники", "Псовые", "Волки"
    )
    val bear = Carnivores(
        "Млекопитающие", "Хищники", "Медвежьи", "Медведи"
    )
    val horse = Herbivores(
        "Млекопитающие", "Непарнокопытные", "Лошадиные", "Лошади"
    )
    val koala = Herbivores(
        "Млекопитающие", "Двурезцовые сумчатые", "Коаловые", "Коалы"
    )

    val carnivoresList = listOf(wolf, bear)
    val herbivoresList = listOf(horse, koala)

    println("Научная классификация вида Серый волк:")
    for (property in Carnivores::class.memberProperties) {
        println(property.get(wolf))
    }
    println("\n")

    println("Научная классификация вида Бурый медведь:")
    for (property in Carnivores::class.memberProperties) {
        println(property.get(bear))
    }
    println("\n")

    println("Научная классификация вида Домашняя лошадь:")
    for (property in Herbivores::class.memberProperties) {
        println(property.get(horse))
    }
    println("\n")

    println("Научная классификация вида Коала:")
    for (property in Herbivores::class.memberProperties) {
        println(property.get(koala))
    }

}