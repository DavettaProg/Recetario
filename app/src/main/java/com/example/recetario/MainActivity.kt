package com.example.recetario

//IMPORTS COMENTADOS PARA PRUEBAS
import android.os.Bundle
//import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetario.ui.screens.MealDetailScreen
import com.example.recetario.ui.theme.RecetarioTheme

//import androidx.lifecycle.lifecycleScope
//import kotlinx.coroutines.flow.collect
//import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecetarioTheme {}
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "menu") {
                composable("menu") { MenuScreen(navController) }
                composable("mealDetail/{mealId}") { backStackEntry ->
                    val mealId = backStackEntry.arguments?.getString("mealId")
                    mealId?.let { MealDetailScreen(it) }



                }
            }
        }
    }
}
// MenuScreen(recetarioViewModel = viewModel)
            //PARTE DE LA ZONA DE PRUEBAS EN LOGCAT
                //observeViewModel()


            /*
    ZONA DE PRUEBAS PARA LOGCAT *NO TOCAR*
    private fun observeViewModel() {
        // Observar y mostrar categorías en el Logcat
        lifecycleScope.launch {
            viewModel.categoriesList.collect { categories ->
                Log.d("MainActivity", "Categories: ${categories.size}")
                categories.forEach { category ->
                    Log.d("Categories", category.toString())
                }
            }
        }

        // Observar y mostrar países en el Logcat
        lifecycleScope.launch {
            viewModel.countriesList.collect { countries ->
                Log.d("MainActivity", "Countries: ${countries.size}")
                countries.forEach { country ->
                    Log.d("Countries", country.toString())
                }
            }
        }

        // Observar y mostrar ingredientes en el Logcat
        lifecycleScope.launch {
            viewModel.ingredientsList.collect { ingredients ->
                Log.d("MainActivity", "Ingredients: ${ingredients.size}")
                ingredients.forEach { ingredient ->
                    Log.d("Ingredients", ingredient.toString())
                }
            }
        }

        // Obtener y mostrar detalles de una comida por ID en el Logcat
        lifecycleScope.launch {
            viewModel.getMealDetailById("52772") // Reemplaza "52772" con un ID válido
            viewModel.mealDetail.collect { mealDetails ->
                Log.d("MainActivity", "MealDetail: ${mealDetails.size}")
                mealDetails.forEach { mealDetail ->
                    Log.d("MealDetail", mealDetail.toString())
                }
            }
        }

        // Obtener y mostrar comidas por primera letra en el Logcat
        lifecycleScope.launch {
            viewModel.getMealsByFirstLetter("a") // Reemplaza "a" con una letra válida
            viewModel.mealsList.collect { meals ->
                Log.d("MainActivity", "Meals by first letter 'a': ${meals.size}")
                meals.forEach { meal ->
                    Log.d("MealsByFirstLetter", meal.toString())
                }
            }
        }

        // Obtener y mostrar comidas por nombre en el Logcat
        lifecycleScope.launch {
            viewModel.getMealByName("Arrabiata") // Reemplaza "Arrabiata" con un nombre válido
            viewModel.mealsList.collect { meals ->
                Log.d("MainActivity", "Meals by name 'Arrabiata': ${meals.size}")
                meals.forEach { meal ->
                    Log.d("MealsByName", meal.toString())
                }
            }
        }
    }

 */


