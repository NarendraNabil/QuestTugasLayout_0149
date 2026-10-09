
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
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.cd_logo),
                modifier = Modifier.size(50.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = nameRes),
                    color = colorResource(id = R.color.text_white),
                    fontSize = 18.sp,
                    fontFamily = if (isCursiveFont) {
                        FontFamily.Cursive
                    } else {
                        FontFamily.Default
                    },
                    fontWeight = if (isCursiveFont) {
                        FontWeight.Normal
                    } else {
                        FontWeight.Bold
                    }
                )

                if (phoneRes != null) {
                    Text(
                        text = stringResource(id = phoneRes),
                        color = colorResource(id = R.color.text_cyan),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }

                Text(
                    text = stringResource(id = locationRes),
                    color = colorResource(id = R.color.text_yellow),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.cd_logo),
                modifier = Modifier.size(50.dp)
            )
        }
    }
}
