package com.example.shoppinglist.domain

class EditShoppingListUseCase(
    private val shopListRepository: ShopListRepository
) {
    fun editShoppingList(shopItem: ShopItem){
shopListRepository.editShoppingList(shopItem)

    }
}