package com.example.fooddelivery.ui.screen

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fooddelivery.ui.screen.components.ProductPreviewSection

@Composable
fun ProductDetailScreen(modifier: Modifier = Modifier) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductPreviewSection()
    }
}