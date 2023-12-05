package com.example.navigationjetpackcompose.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {

    object HomeScreen : Screen(route = "home_screen")

    //Required:
    object DetailScreen :
        Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {

        //Single Required Arguments:
        fun passId(id: Int): String {
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
        }

        //Multiple Required Arguments:
        fun passNameAndId(
            id: Int,
            name: String
        ): String {
            return "detail_screen/$id/$name"
        }

    }

    //Optional:
    /*object DetailScreen :
        Screen(route = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}") {

        //Single Optional Arguments:
        fun passId(id: Int = 0): String {
            return "detail_screen?id=$id"
        }

        //Multiple Optional Arguments:
        fun passNameAndId(
            id: Int = 0,
            name: String = "Patrick"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }

    }*/


}