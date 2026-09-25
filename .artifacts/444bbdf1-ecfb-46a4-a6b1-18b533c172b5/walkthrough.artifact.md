# Tabla de Frutas en Perfil

Se ha implementado la funcionalidad para mostrar una tabla de frutas dinámicamente al presionar el botón "Ejecutar" en la pantalla de perfil.

## Cambios Realizados

### ViewModel (`MainViewModel.kt`)
- Se añadió la data class `Fruit` con atributos `name`, `color` y `price`.
- Se implementó el estado `showTable` que controla la visibilidad de la tabla.
- Se definió una lista estática de frutas (`Manzana`, `Plátano`, `Pera`, etc.).
- La función `ejecuta()` ahora activa `showTable = true`.

### Pantalla de Perfil (`ProfileScreen.kt`)
- Se creó el composable `FruitTable` utilizando `LazyColumn` para una visualización eficiente.
- La tabla incluye una cabecera estilizada con `Color.LightGray`.
- Cada fila muestra el nombre, color y precio de la fruta con bordes definidos.
- Se añadió lógica condicional para que la tabla solo aparezca tras presionar el botón.

## Verificación
- [x] **Compilación**: El proyecto compila correctamente con `:app:assembleDebug`.
- [x] **Lógica**: El estado se mantiene correctamente en el ViewModel siguiendo el patrón MVVM.
