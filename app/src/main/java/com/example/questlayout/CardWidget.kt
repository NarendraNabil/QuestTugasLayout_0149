
package com.example.questlayout

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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


@Composable
fun UmyAppScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.bg_screen))
            .padding(top = 48.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    
