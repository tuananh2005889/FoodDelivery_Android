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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fooddelivery.data.ProductFlavorData
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.screen.ProductDetailScreen

import com.example.fooddelivery.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold { paddingValues ->
                    ProductDetailScreen(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues),
                        productPreviewState = ProductPreviewState(),
                        productFlavor = ProductFlavorData
                    )
                }
            }
        }
    }
}
