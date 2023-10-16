package com.apirestkotlin.apirestkotlin.repositories

import com.apirestkotlin.apirestkotlin.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Int> {
}