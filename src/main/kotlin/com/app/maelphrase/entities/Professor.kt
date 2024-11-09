package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "professor")
data class Professor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Va générer automatiquement les id (comme SQL)
    val id: Long,                  // = SQL bigint
    val first_name: String,        // = SQL varchar
    val last_name: String,
    val email: String,
    val password: String,
    val activities_id: Long,
    val classroom_id: Long,
    val reg_date: Date

)