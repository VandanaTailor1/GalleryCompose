package com.gallerycompose

import android.R
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gallerycompose.ui.theme.GalleryComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                HeaderTextViewCreate(data = "Sign Up")
                EditTexts()
            }

//            GalleryComposeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
//                    editTexts()
//                }
    //        }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}


@Composable
fun EditTexts() {
    var text by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
    Column(
        horizontalAlignment = Alignment.Start, modifier = Modifier
            .padding(10.dp, 30.dp, 10.dp, 10.dp)
    ) {
        TextViewCreate(data = "Enter your First Name")
        NameEditText("First Name")
        TextViewCreate(data = "Enter you Last Name")
        NameEditText("Last Name")
        TextViewCreate(data = "Enter you Phone Number")
        NameEditText("Phone Number Name")
        ButtonCreate()

    }
}
}

@Composable
fun TextViewCreate(data : String){
    Text(
        text = data,
        color = Color.Blue,
        modifier = Modifier
            .padding(5.dp,10.dp,5.dp,5.dp),
        fontSize = 15.sp,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily.Monospace,
        maxLines = 1,
        fontWeight = FontWeight.Bold,
    )
}

@Composable
fun HeaderTextViewCreate(data : String){
    Text(
        text = data,
        color = Color.Blue,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp,120.dp,5.dp,5.dp),
        fontSize = 15.sp,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily.Monospace,
        textAlign = TextAlign.Center,
        maxLines = 1,
        fontWeight = FontWeight.Bold
    )
}




@Composable
fun NameEditText(value : String) {
  var text by remember {
      mutableStateOf("")
  }
    OutlinedTextField(value = text, onValueChange = {text = it},
        label = { Text(text = value)},
        modifier = Modifier.fillMaxWidth()

    )
}

@Composable
fun ButtonCreate() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.Center)
        ) {

            Text(text = "Submit", textAlign = TextAlign.Center)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GalleryComposeTheme {
        EditTexts()
    }
}