package com.example.fooddelivery.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductDescriptionSection(
    modifier: Modifier = Modifier,
    productDescription: String,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(11.dp),
        horizontalAlignment = Alignment.Start

    )
    {
        Text(
            text ="Description",
            style = AppTheme.typography.titleLarge,
            color = AppTheme.color.onBackGround
        )
        Text(
            text = productDescription,
            style = AppTheme.typography.body,
            color = AppTheme.color.onBackGround,
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxWidth(),
        )
    }

}