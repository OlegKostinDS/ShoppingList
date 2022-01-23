package com.example.shoppinglist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) { //use case
    fun getShopList(): List<ShopItem>{
       return shopListRepository.getShopList()

    }
}