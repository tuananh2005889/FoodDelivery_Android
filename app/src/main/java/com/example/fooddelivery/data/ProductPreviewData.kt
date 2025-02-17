package com.example.fooddelivery.data


import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType{
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "Mr. tuan anh",
    @DrawableRes
    val productImg: Int = R.drawable.buger,
    val highLight: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "classic Taste",
            type = ProductHighlightType.SECONDARY
        ),
        ProductHighlightState(
            text="Best seller",
            type = ProductHighlightType.PRIMARY
        )
    )
    )