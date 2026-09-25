package com.example.practica_delay.ui.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

data class Fruit(
    val name: String,
    val color: String,
    val price: Double
)

class MainViewModel : ViewModel() {
    var mensaje by mutableStateOf("Esperando...")
        private set

    var showTable by mutableStateOf(false)
        private set

    var isLoading by mutableStateOf(false)
        private set

    var fruits by mutableStateOf<List<Fruit>>(emptyList())
        private set

    fun ejecuta() {
        if (isLoading) return

        viewModelScope.launch {
            isLoading = true
            showTable = false
            mensaje = "Cargando frutas..."

            delay(3000L) // Simula la carga asíncrona suspendiendo la corrutina por 3 segundos

            fruits = listOf(
                Fruit("Manzana", "Rojo", 1.500),
                Fruit("Plátano", "Amarillo", 2.000),
                Fruit("Pera", "Verde", 1.200),
                Fruit("Naranja", "Naranja", 1.100),
                Fruit("Uva", "Morado", 2.500)
            )

            mensaje = "¡Tabla de frutas generada!"
            showTable = true
            isLoading = false
        }
    }
}

