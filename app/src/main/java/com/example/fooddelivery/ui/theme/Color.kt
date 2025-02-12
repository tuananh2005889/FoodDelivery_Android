package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

var Pink = Color(0xFFF28482)
var Green = Color(0xFF84A59D)
var Yellow = Color(0xFFF7EDE2)
var YellowLight = Color(0xFFFFFFF2)
var Dark = Color(0xFF3D405B)


@Immutable
data class AppColors(
    val backGround: Color,
    val onBackGround: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color
)

val LocalAppColor = staticCompositionLocalOf {
    AppColors(
        backGround = Color.Unspecified,
        onBackGround = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified

    )
}

val extendedColors = AppColors(
    backGround = Color.White,
    onBackGround = Dark,
    surface = Color.White,
    onSurface = Dark,
    secondarySurface = Pink,
    onSecondarySurface = Pink,
    regularSurface = YellowLight,
    onRegularSurface = Dark,
    actionSurface = Yellow,
    onActionSurface = Pink,
    highlightSurface = Green,
    onHighlightSurface = Color.White
)
val extendedColorsd = AppColors(
    backGround = Color.White,
    onBackGround = Dark,
    surface = Color.White,
    onSurface = Dark,
    secondarySurface = Pink,
    onSecondarySurface = Pink,
    regularSurface = YellowLight,
    onRegularSurface = Dark,
    actionSurface = Yellow,
    onActionSurface = Pink,
    highlightSurface = Green,
    onHighlightSurface = Color.White
)
//val extendedColorsd = AppColors(
//    backGround = Color.White,
//    onBackGround = Dark,
//    surface = Color.White,
//    onSurface = Dark,
//    secondarySurface = Pink,
//    onSecondarySurface = Pink,
//    regularSurface = YellowLight,
//    onRegularSurface = Dark,
//    actionSurface = Yellow,
//    onActionSurface = Pink,
//    highlightSurface = Green,
//    onHighlightSurface = Color.White
//)val extendedColorsd = AppColors(
//    backGround = Color.White,
//    onBackGround = Dark,
//    surface = Color.White,
//    onSurface = Dark,
//    secondarySurface = Pink,
//    onSecondarySurface = Pink,
//    regularSurface = YellowLight,
//    onRegularSurface = Dark,
//    actionSurface = Yellow,
//    onActionSurface = Pink,
//    highlightSurface = Green,
//    onHighlightSurface = Color.White
//)val extendedColorsd = AppColors(
//    backGround = Color.White,
//    onBackGround = Dark,
//    surface = Color.White,
//    onSurface = Dark,
//    secondarySurface = Pink,
//    onSecondarySurface = Pink,
//    regularSurface = YellowLight,
//    onRegularSurface = Dark,
//    actionSurface = Yellow,
//    onActionSurface = Pink,
//    highlightSurface = Green,
//    onHighlightSurface = Color.White
//)
//
//
