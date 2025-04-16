package com.ucb.ucbtest.navigation

sealed class Screen(
    val route: String,
) {
    object GitaliasScreen : Screen("gitlab")

    object TakePhotoScreen : Screen("takephoto")

    object MenuScreen : Screen("menu")

    object LoginScreen : Screen("login")

    object MoviesScreen : Screen("movies")

    object MovieDetailScreen : Screen("movieDetail")

    object CounterScreen : Screen("counter")

    object NotificationScreen : Screen("notification_screen")

    object ExpenseIncomeScreen : Screen("expense_income_screen")

    object BookScreen : Screen("book_screen")

    object SavedBooksScreen : Screen("saved_books_screen")
}
