package com.openappslabs.composecatalog.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement

// Row Parameters
// modifier - The modifier to be applied to the Row.
// horizontalArrangement - The horizontal arrangement of the layout's children.
// verticalAlignment - The vertical alignment of the layout's children.
// content - The content of the Row

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowExample(
) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Apple", fontSize = 24.sp)
        Text(text = "Banana", fontSize = 24.sp)
        Text(text = "Mango", fontSize = 24.sp)
    }
}