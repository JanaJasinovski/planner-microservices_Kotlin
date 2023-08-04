package ru.javabegin.micro.planner.todo.search

import java.util.*

// в этом файле будут находитьяс все дата классы для поиска


// возможные значения, по которым можно искать задачи + значения сортировки
data class TaskSearchValues (
        var sortColumn: String,
        var sortDirection: String,
        var pageNumber: Int,
        var pageSize: Int,
        var userId: Long
){

    // остальные поля - необяз к заполнению
    var title: String? = null
    var completed: Int? = null
    var priorityId: Long? = null
    var categoryId: Long? = null
    var dateFrom // для задания периода по датам
            : Date? = null
    var dateTo: Date? = null
}


// возможные значения, по которым можно искать приоритеты
data class PrioritySearchValues(var userId: Long) {

    var title: String? = null

}

// возможные значения, по которым можно искать категории
class CategorySearchValues(var userId: Long) {
    var title: String? = null
}