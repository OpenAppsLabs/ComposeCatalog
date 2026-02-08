package com.openappslabs.composecatalog.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// Column Parameters:
// modifier - The modifier to be applied to the Column.
// verticalArrangement - The vertical arrangement of the layout's children.
// horizontalAlignment - The horizontal alignment of the layout's children.
// content - The content of the Column

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "OpenAppsLabs", fontSize = 24.sp)
        Text(text = "Jotter", fontSize = 24.sp)
        Text(text = "Coffee", fontSize = 24.sp)
        Text(text = "5G", fontSize = 24.sp)
    }
}