package com.busrayalcin.shoppinglist.ui.shoppinglist

import com.busrayalcin.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}