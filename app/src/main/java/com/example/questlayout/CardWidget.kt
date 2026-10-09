package com.example.questlayout



@Composable
fun StudentCardWidget(
    @StringRes nameRes: Int,
    @StringRes phoneRes: Int?,
    @StringRes locationRes: Int,
    @ColorRes bgColorRes: Int,
    isCursiveFont: Boolean = false
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = bgColorRes)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {