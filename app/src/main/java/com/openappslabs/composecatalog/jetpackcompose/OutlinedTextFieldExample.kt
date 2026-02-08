package com.openappslabs.composecatalog.jetpackcompose

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

// OutlinedTextField Composable Parameters
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {

    var name by remember{ mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = {name = it},
        placeholder = { Text(text = "Enter your name") },
    )
}