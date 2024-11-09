package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "student")
data class Student (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Va générer automatiquement les id (comme SQL)
    val id: Long,       // = SQL bigint
    val first_name: String,   // = SQL varchar
    val last_name: String,
    val birthdate: Date,    // Est-ce le bon format Date ?
    val sex: String,
    val classroom_id: Long,
    val level: String,
    val goup_need: String,
    val activities_id: Long,
    val reg_date: Date
)