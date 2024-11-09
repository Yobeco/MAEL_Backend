package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "instruction")
data class Instruction (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Va générer automatiquement les id (comme SQL)
    val id: Long,          // = SQL bigint
    val text1: String,      // = SQL varchar
    val language1_id: Long,
    val text2: String,      // = SQL varchar
    val language2_id: Long,
    val creat_date: Date
)