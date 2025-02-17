package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductFlavorState(
    val name:String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.phomai,
        name = "Cheese",
        price = "$0,5"
    ),
    ProductFlavorState(
        imgRes = R.drawable.thit,
        name = "Meal",
        price = "$0,9"
    ), ProductFlavorState(
        imgRes = R.drawable.hanh,
        name = "Onion",
        price = "$0,2"
    ),

)