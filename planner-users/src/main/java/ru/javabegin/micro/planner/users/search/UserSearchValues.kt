package ru.javabegin.micro.planner.users.search

// контейнер для хранения значений (без функций)
data class UserSearchValues(
            // здесь только обяз. параметры - которые должны иметь значения

                            val email: String,
                            val pageNumber: Int,
                            val pageSize: Int,
                            val sortColumn: String,
                            val sortDirection: String


                            ) {

    val username: String? = null

}