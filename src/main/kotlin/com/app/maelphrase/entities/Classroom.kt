package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "classroom")
data class Classroom (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Va générer automatiquement les id (comme SQL)
    val id: Long,       // = SQL bigint
    val name: String,   // = SQL varchar
    val levels: String,
    val school_year: String,
    val students_id: Long,
    val professor_P_id: Long,
    val other_professors_id: Long,
    val reg_date: Date
)