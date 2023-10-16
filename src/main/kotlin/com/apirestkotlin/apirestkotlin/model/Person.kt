package com.apirestkotlin.apirestkotlin.model

import jakarta.persistence.*

@Entity
data class Person(

    @Column(name = "nome")
    val nome: String,
    @Column(name = "mail")
    val mail: String,
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    var id: Int? /* <- quase certo que isso aqui esta erado.*/
)
