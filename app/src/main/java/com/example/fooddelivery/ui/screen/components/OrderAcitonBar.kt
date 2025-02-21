package com.example.fooddelivery.ui.screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R
import com.example.fooddelivery.data.OrderState
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun OrderActionBar(
    modifier: Modifier = Modifier,
    state: OrderState,
    onAddItemClicked: () -> Unit,
    onRemoveItemClicked: () -> Unit,
    onCheckoutClicked: () -> Unit
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        color = AppTheme.color.surface,
        contentColor = AppTheme.color.onSurface,
        shadowElevation = 16.dp
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .height(90.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Selector(
                amount = state.amount,
                onAddItemClicked = onAddItemClicked,
                onRemoveItemClicked = onRemoveItemClicked,
                modifier = Modifier.weight(1f)
            )
            Cart(
                totalPrice = state.totalPrice,
                onClicked = onCheckoutClicked,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Selector(
    modifier: Modifier = Modifier,
    amount: Int,
    onAddItemClicked: () -> Unit,
    onRemoveItemClicked: () -> Unit,
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, AppTheme.color.secondarySurface)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SelectorButton(
                iconRes = R.drawable.ic_minus,
                containerColor = AppTheme.color.onActionSurface,
                contentColor = AppTheme.color.actionSurface,
                onClicked = onRemoveItemClicked
            )
            Text(
                text = amount.toString(),
                color = AppTheme.color.onSurface,
                style = AppTheme.typography.titleLarge
            )
            SelectorButton(
                iconRes = R.drawable.ic_plus,
                containerColor = AppTheme.color.secondarySurface,
                contentColor = AppTheme.color.onSecondarySurface,
                onClicked = onAddItemClicked
            )
        }
    }
}

@Composable
fun SelectorButton(
    modifier: Modifier = Modifier,
    @DrawableRes iconRes: Int,
    containerColor: Color,
    contentColor: Color,
    onClicked: () -> Unit
) {
    Surface(
        modifier = Modifier.size(36.dp),
        shape = CircleShape,
        color = containerColor,
        contentColor = contentColor
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(onClick = onClicked),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
fun Cart(
    modifier: Modifier = Modifier,
    totalPrice: String,
    onClicked: () -> Unit,
) {
    Surface(
        modifier = modifier
            .clickable(onClick = onClicked)
            .fillMaxWidth(),
        color = Color.Red,
        contentColor = AppTheme.color.onSecondarySurface,
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            modifier = Modifier
//                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Add to cart",
                style = AppTheme.typography.titleSmall,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = totalPrice,
                style = AppTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
