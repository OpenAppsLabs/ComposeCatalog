package com.openappslabs.composecatalog.jetpackcompose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// Text Composable Parameters
// text: String, //Required
// modifier: Modifier = Modifier,
// color: Color = Color.Unspecified,
// fontSize: TextUnit = TextUnit.Unspecified,
// fontStyle: FontStyle? = null,
// fontWeight: FontWeight? = null,
// fontFamily: FontFamily? = null,
// letterSpacing: TextUnit = TextUnit.Unspecified,
// textDecoration: TextDecoration? = null,
// textAlign: TextAlign? = null,
// lineHeight: TextUnit = TextUnit.Unspecified,
// overflow: TextOverflow = TextOverflow.Clip,
// softWrap: Boolean = true,
// maxLines: Int = Int.MAX_VALUE,
// minLines: Int = 1,
// onTextLayout: ((TextLayoutResult) -> Unit)? = null,
// style: TextStyle = LocalTextStyle.current

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExample(){
    Text(
        text = "Text Composable",
        color = Color.Red,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        letterSpacing = 2.sp,
        textAlign = TextAlign.End
    )
}

