package com.openappslabs.composecatalog.jetpackcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// Params:
// modifier - The modifier to be applied to the layout.
// contentAlignment - The default alignment inside the Box.
// propagateMinConstraints - Whether the incoming min constraints should be passed to content.
// content - The content of the Box.

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Text(text ="note 1", fontSize = 24.sp, modifier = Modifier.align(Alignment.BottomEnd))
        Text(text ="note 2", fontSize = 24.sp, modifier = Modifier.align(Alignment.TopEnd))
        Text(text ="note 3", fontSize = 24.sp, modifier = Modifier.align(Alignment.CenterStart))
    }
}