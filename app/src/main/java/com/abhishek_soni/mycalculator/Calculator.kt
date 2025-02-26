package com.abhishek_soni.mycalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek_soni.mycalculator.ui.theme.Purple80

@Composable
fun Calculator(modifier: Modifier = Modifier,
               state: CaculatorState,
               buttonSpacing: Dp=8.dp,
               onAction: (CalculatorAction)->Unit) {
    Box(modifier = modifier.fillMaxSize().padding(5.dp)) {
        Column(modifier = Modifier.fillMaxWidth()
            .align(Alignment.BottomCenter),

            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
        Text(text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 50.dp),
            fontWeight = FontWeight.Light,
            fontSize = 80.sp,
            color = MaterialTheme.colorScheme.onBackground,
            maxLines = 4
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(symbol = "AC",
                    modifier = Modifier
                        .background(Color(0xAEEAADFF))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(symbol = "More",
                    modifier = Modifier
                        .background(Color(0xFFA0E0EF))
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(symbol = "Del",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(symbol = "/",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(symbol = "7",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(symbol = "8",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(symbol = "9",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorButton(symbol = "x",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.multiply))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(symbol = "4",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(symbol = "5",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(symbol = "6",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorButton(symbol = "-",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Substrct))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(symbol = "1",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(symbol = "2",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(symbol = "3",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorButton(symbol = "+",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(symbol = "0",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )
                CalculatorButton(symbol = ".",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(symbol = "=",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }

        }









    }
}