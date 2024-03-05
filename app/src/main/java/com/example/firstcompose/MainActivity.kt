package com.example.firstcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextInput()
        }
    }


//@Composable
//fun sayCheezy(name: String) {
//    Text(
//        text = "Hello ${name}",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.W600,
//        color = Color.Red,
//        fontSize = 36.sp,
//        textAlign = TextAlign.Center
//    )

//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = "Dummy Image",
//        colorFilter = ColorFilter.tint(Color.Green),
//        contentScale = ContentScale.Crop
//    )

//    Button(
//        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Green,
//            backgroundColor = Color.White
//            ), enabled = false
//    ) {
//        Text(text = "Hello")
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = "Dummy"
//        )

//    }

//    TextField(value = "Hello cheezy code",
//        onValueChange = {},
//        label = { Text(text = "enter message")},
//        placeholder = { }
//
//    )
//}


    //@Preview(showBackground = true, name = "harshit", showSystemUi = true)
    @Preview(showBackground = true, name = "harshit", widthDp = 200, heightDp = 200)
    @Composable
    private fun previewFunction(name: String = "Harshit") {
//    sayCheezy(name = "Ravi")

        TextField(
            value = "hello harshit",
            onValueChange = {},
            label = { Text(text = "Enter Message") },
            placeholder = {}
        )
    }


    @Composable
    fun TextInput() {

        val state = remember{mutableStateOf("")}
        TextField(
            value = state.value,
            onValueChange = {
                state.value = it
            },
            label = { Text(text = "Enter Message") },

            )
    }
}


