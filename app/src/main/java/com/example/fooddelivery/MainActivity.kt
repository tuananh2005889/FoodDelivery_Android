package com.example.fooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fooddelivery.data.OrderState
import com.example.fooddelivery.data.ProductFlavorData
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.screen.ProductDetailScreen

import com.example.fooddelivery.ui.theme.AppTheme

private const val PRODUCT_PRICE_PER = 5.01
private const val PRODUCT_CURRENCY ="$"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                var amount by remember {
                    mutableIntStateOf(1)
                }
                val totalPRice by remember {
                    derivedStateOf { amount * PRODUCT_PRICE_PER }
                }
                ProductDetailScreen(
                    onCheckoutClicked = {},
                    onAddItemClicked = {amount = amount.inc()},
                    onRemoveItemCLicked = {if(amount>0) amount=amount.dec()},
                    orderState = OrderState(
                        amount = amount,
                        totalPrice = "$PRODUCT_CURRENCY${totalPRice}"
                    )
                )
            }
        }
    }
}
