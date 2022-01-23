package com.example.shoppinglist.domain

class DeleteShopListUseCase(
    private val shopListRepository: ShopListRepository
) {
    fun deleteShopItemUseCase(shopItem: ShopItem){
shopListRepository.deleteShopItemUseCase(shopItem)
    }
}