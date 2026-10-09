package com.example.questlayout



@Composable
fun StudentCardWidget(
    @StringRes nameRes: Int,
    @StringRes phoneRes: Int?,
    @StringRes locationRes: Int,
    @ColorRes bgColorRes: Int,
    isCursiveFont: Boolean = false
