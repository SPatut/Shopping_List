package com.example.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopIdemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopIdemId)
    }
}