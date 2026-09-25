package com.example.practica_delay.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.practica_delay.ui.viewModel.Fruit
import com.example.practica_delay.ui.viewModel.MainViewModel

@Composable
fun ProfileScreen(
    navController: NavHostController,
    id: String?,
    mainViewModel: MainViewModel = viewModel()
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Hola desde el perfil con ID: $id"
            )
            Text(
                text = mainViewModel.mensaje
            )
            Button(
                onClick = {
                    navController.navigate("home")
                }
            ) {
                Text(
                    text = "Volver al Home"
                )
            }
            Button(
                onClick = { mainViewModel.ejecuta() },
                enabled = !mainViewModel.isLoading
            ) {
                Text(
                    text = if (mainViewModel.isLoading) "Cargando..." else "Ejecutar"
                )
            }

            if (mainViewModel.showTable) {
                FruitTable(fruits = mainViewModel.fruits)
            }
        }
    }
}

@Composable
fun FruitTable(fruits: List<Fruit>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .border(1.dp, Color.Black)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(8.dp)
            ) {
                Text(text = "Nombre", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
                Text(text = "Color", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
                Text(text = "Precio", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
            }
        }
        items(fruits) { fruit ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(0.5.dp, Color.Gray)
                    .padding(8.dp)
            ) {
                Text(text = fruit.name, modifier = Modifier.weight(1f))
                Text(text = fruit.color, modifier = Modifier.weight(1f))
                Text(text = "$${fruit.price}", modifier = Modifier.weight(1f))
            }
        }
    }
}
