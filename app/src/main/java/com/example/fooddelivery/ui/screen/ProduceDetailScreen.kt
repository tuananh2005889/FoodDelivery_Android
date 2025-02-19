package com.example.fooddelivery.ui.screen

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.contentValuesOf
import com.example.fooddelivery.data.ProductDescripztionData
import com.example.fooddelivery.data.ProductFlavorData
import com.example.fooddelivery.data.ProductFlavorState
import com.example.fooddelivery.data.ProductNutritionData
import com.example.fooddelivery.data.ProductNutritionState
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.screen.components.FlavorSection
import com.example.fooddelivery.ui.screen.components.OrderActionBar
import com.example.fooddelivery.ui.screen.components.ProductDescriptionSection
import com.example.fooddelivery.ui.screen.components.ProductNutritionSection
import com.example.fooddelivery.ui.screen.components.ProductPreviewSection
import com.example.fooddelivery.ui.theme.AppTheme
import androidx.compose.material3.Text
import com.example.fooddelivery.data.OrderData
import com.example.fooddelivery.data.OrderState

@Composable
fun ProductDetailScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavor: List<ProductFlavorState> = ProductFlavorData,
    productNutritionState: ProductNutritionState = ProductNutritionData,
    productDescription: String = ProductDescripztionData,
    orderState: OrderState = OrderData,
    onAddItemClicked:() -> Unit,
    onRemoveItemCLicked:() -> Unit,
    onCheckoutClicked:() -> Unit

) {
    Box(modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter
        ){
        Content(
            productPreviewState = productPreviewState,
            productFlavor = productFlavor,
            productDescription = productDescription,
            productNutritionState = productNutritionState
        )
        OrderActionBar(
            state = orderState,
            onAddItemClicked = onAddItemClicked,
            onRemoveItemCLicked = onRemoveItemCLicked,
            onCheckoutClicked = onCheckoutClicked,
            modifier = Modifier
                .navigationBarsPadding()
                .padding(
                    horizontal = 18.dp,
                    vertical = 8.dp
                )

        )
    }
}

@Composable
fun Content(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState,
    productFlavor: List<ProductFlavorState>,
    productNutritionState: ProductNutritionState ,
    productDescription: String



) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        FlavorSection(
            modifier = Modifier.padding(18.dp),
            data = productFlavor
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        ProductNutritionSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            state = ProductNutritionData
        )
        Spacer(
            modifier = modifier.height(32.dp)
        )
        ProductDescriptionSection(
            productDescription = productDescription,
            modifier = Modifier
                .navigationBarsPadding()
                .padding(horizontal = 18.dp)
                .padding(bottom = 128.dp)
        )
    }
}
