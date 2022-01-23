package com.example.shoppinglist.domain


//SOLID S - single responsibility принцип единой ответственнности
data class ShopItem(
    val name: String,
    val count: Int,
    val isEnable : Boolean,
    var id: Int = UNDEFINED_ID
)
{companion object
{
    const val UNDEFINED_ID = -1
}}
