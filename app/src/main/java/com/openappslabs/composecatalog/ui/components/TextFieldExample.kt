package com.openappslabs.composecatalog.ui.components

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// TextField Composable Parameters
// value: String, // Required
// onValueChange: (String) -> Unit, // Required
// modifier: Modifier = Modifier,
// enabled: Boolean = true,
// readOnly: Boolean = false,
// textStyle: TextStyle = LocalTextStyle.current,
// label: @Composable (() -> Unit)? = null,
// placeholder: @Composable (() -> Unit)? = null,
// leadingIcon: @Composable (() -> Unit)? = null,
// trailingIcon: @Composable (() -> Unit)? = null,
// prefix: @Composable (() -> Unit)? = null,
// suffix: @Composable (() -> Unit)? = null,
// supportingText: @Composable (() -> Unit)? = null,
// isError: Boolean = false,
// visualTransformation: VisualTransformation = VisualTransformation.None,
// keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
// keyboardActions: KeyboardActions = KeyboardActions.Default,
// singleLine: Boolean = false,
// maxLines: Int = if (singleLine) 1 else Int.MAX_…,
// minLines: Int = 1,
// interactionSource: MutableInteractionSource? = null,
// shape: Shape = TextFieldDefaults.shape,
// colors: TextFieldColors = TextFieldDefaults.colors()

@Preview(showBackground = true)
@Composable
private fun TextFieldExample() {

    var name by remember{ mutableStateOf("") }

    TextField(
        value = name,
        onValueChange = {name = it},
        placeholder = { Text(text = "Enter your name") },
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Blue,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Green,
            focusedIndicatorColor = Color.Magenta,
            cursorColor = Color.Black,
            errorCursorColor = Color.Black,
            errorIndicatorColor = Color.Black,
            errorLabelColor = Color.Black,
            errorLeadingIconColor = Color.Black,
            errorPlaceholderColor = Color.Black,
            errorTrailingIconColor = Color.Black,
        )
    )
}