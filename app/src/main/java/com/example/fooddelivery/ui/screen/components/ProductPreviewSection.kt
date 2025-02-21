package com.example.fooddelivery.ui.screen.components

import android.app.ActionBar
import android.app.Notification.Action
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProduceStateScope
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.AppTheme

import androidx.constraintlayout.compose.ConstraintLayout
import com.example.fooddelivery.data.ProductPreviewState

@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier,
    state: ProductPreviewState

) {
    Box(
        modifier = modifier.height(IntrinsicSize.Max)
    ) {
       ProductBackGround(
           modifier = Modifier.padding(bottom = 24.dp)
       )
        Content(
            state = state,
            modifier = Modifier.statusBarsPadding()
                .padding(top = 24.dp)
        )

    }
}

@Composable
private fun ProductBackGround(modifier: Modifier = Modifier) {
   Box(
       modifier = Modifier
           .fillMaxSize()
           .background(
               color = AppTheme.color.secondarySurface,
               shape = RoundedCornerShape(
                   bottomStart = 32.dp,
                   bottomEnd = 32.dp
               )
           )
   )
}


@Composable
private fun Content(
    modifier: Modifier= Modifier,
    state: ProductPreviewState
) {
    ConstraintLayout (
       modifier = modifier.fillMaxWidth()
   ) {
       val (actionBar, highlights, productImg) = createRefs()

       ActionBar(
           headline = state.headline,
           modifier = Modifier
               .padding(horizontal = 18.dp)
               .constrainAs(actionBar) {
                   top.linkTo(parent.top)
               },
       )
        Image(painter = painterResource(id = R.drawable.buger),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .height(256.dp)
                .constrainAs(productImg) {
                    end.linkTo(parent.end)
                    top.linkTo(anchor = actionBar.bottom, margin = 20.dp)
                }
            )
        ProductHighlights(
            highlights = state.highLight,
            modifier = Modifier
                .padding(horizontal = 19.dp)
                .constrainAs(highlights) {
                    start.linkTo(parent.start)
                    top.linkTo(actionBar.bottom, margin = 10.dp)
                }
        )



    }
}

@Composable
private fun ActionBar(
    headline: String,
    modifier: Modifier = Modifier

) {
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = headline,
            style = AppTheme.typography.headline,
            color = AppTheme.color.onSurface
        )
        CloseButton()
    }
}

@Composable
private fun CloseButton(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(44.dp),
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.color.actionSurface,
        contentColor = AppTheme.color.secondarySurface
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier = Modifier.size(24.dp))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewProductPreviewSection() {
    val state = remember { mutableStateOf(ProductPreviewState()) }
    ProductPreviewSection(state = state.value)
}
