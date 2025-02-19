package com.example.fooddelivery.ui.screen.components

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.data.Calories
import com.example.fooddelivery.data.NutritionState
import com.example.fooddelivery.data.ProductNutritionState
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductNutritionSection(
    modifier: Modifier = Modifier,
    state: ProductNutritionState
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

    SectionHeader(
        title = "Nutrition facts",
        calories = state.calories
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            state.nutrition.onEach {
                item-> NutritionItem(state = item)
            }
        }
    }
}

@Composable
fun SectionHeader(
    modifier: Modifier =Modifier,
    title: String,
    calories: Calories
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = AppTheme.typography.titleLarge,
            color = AppTheme.color.onBackGround
        )
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ){
            Text(
                text = calories.value,
                style = AppTheme.typography.titleMedium,
                color = AppTheme.color.onBackGround
            )
            Text(
                text = calories.unit,
                style = AppTheme.typography.titleMedium,
                color = AppTheme.color.onBackGround
            )
        }
    }
}

@Composable
fun NutritionItem(
    modifier: Modifier =Modifier,
    state: NutritionState
) {
    Column(
        modifier=modifier,
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
     {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = state.amount,
                style =AppTheme.typography.titleMedium,
                fontWeight = FontWeight.Light,
                color = AppTheme.color.onBackGround
            )
            Text(
                text = state.unit,
                style =AppTheme.typography.titleMedium,
                fontWeight = FontWeight.Light,
                color = AppTheme.color.onBackGround
            )
        }
    }
}