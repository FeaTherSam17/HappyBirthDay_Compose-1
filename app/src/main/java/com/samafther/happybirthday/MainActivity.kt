package com.samafther.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samafther.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = MaterialTheme.colorScheme.background
                ) { innerPadding ->
                    GreetingText(
                        message = "Happy Birthday Erika!!",
                        from = "From Sam <3",
                        modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun GreetingText(modifier: Modifier = Modifier,message: String, from: String){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize().padding(8.dp)) {
        Text(
            //modifier = modifier
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty) //Toma el ID de recurso como argumento
    Image(
        painter = image,
        contentDescription = null
    )
}


@Preview(
    showBackground = true,
  showSystemUi = true
    )
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {

        //GreetingText(message = "Happy Birthday Erika!", from = "From Sam")
        GreetingImage(
            message = "Happy birthday Violet!!",
            from = "From Sam <3"
        )
    }
}