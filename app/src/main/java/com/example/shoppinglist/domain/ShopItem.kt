package com.example.shoppinglist.domain


//SOLID S - single responsibility принцип единой ответственнности
data class ShopItem(
    val name: String,
    val count: Int,
    val index: Int,
    val isEnable : Boolean
)
