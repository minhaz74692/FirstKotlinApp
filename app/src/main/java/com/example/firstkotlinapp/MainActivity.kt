package com.example.firstkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstkotlinapp.ui.theme.FirstKotlinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            val painter = painterResource(id = R.drawable.img1)
            val title = "First Image";
            val description = "This is description"

            ImageCard(title = title, painter = painter, description =description)

//                   Column(
//                       modifier = Modifier
////                           .fillMaxSize(fraction = .5f)
//                           .width(200.dp)
//                           .height(400.dp)
//
//                           .background(color = Color.Green)
//                           .padding(50.dp),
//                       horizontalAlignment = Alignment.CenterHorizontally,
//                       verticalArrangement = Arrangement.Center,
//                       ) {
//                       Text( "Android")
//                       Text( "IOS")
//
//                   }


        }
    }
}

@Composable
fun ImageCard(
    title: String,
    painter: Painter,
    description: String,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp)) {
        Box(modifier  =
        modifier.fillMaxHeight(.5f),
            contentAlignment = Alignment.BottomStart
            ){
            Image(painter=painter, contentDescription = description, contentScale = ContentScale.Crop)
            Text(title, style = TextStyle(fontSize =18.sp, color = Color.White,),)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstKotlinAppTheme {
        Greeting("Android")
    }
}