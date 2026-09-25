package com.example.practica_delay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.practica_delay.ui.navHost.Navigation
import com.example.practica_delay.ui.theme.Practica_delayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_delayTheme {
                Navigation()
            }
        }
    }
}


@Composable
fun Caja() {
    Card(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .background(Color.Gray)
    ) { }
}

@Composable
fun ScrollRow(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
    ) {
        items(10) { index ->
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(Color.Red)
            ) {
                Text(
                    text = "$index"
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}

@Composable
fun ScrollColm(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxHeight()
    ) {
        items(10) { index ->
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(Color.Red)
            ) {
                Text(
                    text = "$index"
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun ScrollMix(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                items(10) { index ->
                    Box(
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .background(Color.Red)
                    ) {
                        Text(
                            text = "$index"
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        }
        items(15) { index ->
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(Color.Blue)
            ) {
                Text(
                    text = "$index"
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}
