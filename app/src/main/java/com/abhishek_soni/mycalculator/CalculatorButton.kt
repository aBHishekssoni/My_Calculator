package com.abhishek_soni.mycalculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(modifier: Modifier = Modifier,
                     symbol: String,
                     onClick: () -> Unit) {
    Box(modifier = Modifier.clip(CircleShape)
        .clickable { onClick() }
        .then(modifier),
        contentAlignment = Alignment.Center) {
     Text(text = symbol,
         fontSize = 36.sp,
         color = MaterialTheme.colorScheme.onSecondaryContainer
         )
    }

}