# Plan para Mostrar Tabla de Frutas

Este plan describe cómo implementar una tabla de frutas que se muestra al presionar el botón "Ejecutar" en la pantalla de perfil.

## Cambios Propuestos

### Componente: ViewModel

#### [MODIFY] [MainViewModel.kt](file:///C:/Users/oscar/AndroidStudioProjects/practica_delay/app/src/main/java/com/example/practica_delay/ui/viewModel/MainViewModel.kt)
- Definir una data class `Fruit` (Nombre, Color, Precio).
- Añadir un estado `showTable` (Boolean).
- Añadir una lista de frutas estática o generada.
- Actualizar `ejecuta()` para establecer `showTable = true`.

### Componente: Interfaz de Usuario

#### [MODIFY] [ProfileScreen.kt](file:///C:/Users/oscar/AndroidStudioProjects/practica_delay/app/src/main/java/com/example/practica_delay/ui/screen/ProfileScreen.kt)
- Crear un componente Composable `FruitTable` que renderice los datos en formato de tabla (usando `Row` y `Column` o `LazyColumn`).
- Mostrar `FruitTable` condicionalmente basado en el estado del ViewModel.

## Verificación Plan

### Manual Verification
1. Navegar a la pantalla de Perfil.
2. Presionar el botón "Ejecutar".
3. Verificar que aparece una tabla con columnas de Nombre, Color y Precio de las frutas.
