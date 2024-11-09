package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "school")
data class School (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Va générer automatiquement les id (comme SQL)
    val id: Long,       // = SQL bigint
    val name: String,   // = SQL varchar
    val uai_id: Long,
    val academy: String,
    val adress: String,
    val phone_number: String,
    val responsible: Long,
    val classromms_id: Long,
    val reg_date: Date
)