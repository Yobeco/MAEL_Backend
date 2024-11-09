package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date


@Entity
@Table(name = "activity")
data class Activity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Va générer automatiquement les id (comme SQL)
    val id: Long,          // = SQL bigint
    val name: String,      // = SQL varchar
    val academy: String,
    val language: String,
    val classroom_id: Long,
    val instuction_id: Long,
    val binders_id: Long,
    val creat_date: Date
)