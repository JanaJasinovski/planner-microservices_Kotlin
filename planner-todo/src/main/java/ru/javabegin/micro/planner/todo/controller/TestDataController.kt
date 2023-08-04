package ru.javabegin.micro.planner.todo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.javabegin.micro.planner.todo.service.TestDataService

// для заполнения тестовыми данными
@RestController
@RequestMapping("/data") // базовый URI
class TestDataController     // используем автоматическое внедрение экземпляра класса через конструктор
// не используем @Autowired ля переменной класса, т.к. "Field injection is not recommended "
(
        private val testDataService: TestDataService
) {

    @PostMapping("/init")
    fun init(@RequestBody userId: Long): ResponseEntity<Boolean> {
        testDataService.initTestData(userId)

        // если пользователя НЕ существует
        return ResponseEntity.ok(true)
    }
}