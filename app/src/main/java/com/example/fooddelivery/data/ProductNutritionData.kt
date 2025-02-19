package com.example.fooddelivery.data

data class ProductNutritionState(
    val calories: Calories,
    val nutrition: List<NutritionState>
)

data class Calories(
    val value: String,
    val unit: String,
)

data class NutritionState(
    val amount: String,
    val unit: String,
    val title: String
)

val ProductNutritionData = ProductNutritionState(
    calories = Calories(
        value = "650",
        unit = "cal"
    ),
    nutrition = listOf(
        NutritionState(
            amount = "35",
            unit ="g",
            title = "Total fat (45% DV)"
        ),
        NutritionState(
            amount = "35",
            unit ="g",
            title = "Total Carbs (16% DV)"
        ),
        NutritionState(
            amount = "35",
            unit ="g",
            title = "Protein)"
        ),
    )
)