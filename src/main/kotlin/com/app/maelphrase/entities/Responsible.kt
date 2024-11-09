package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "responsible")
data class Responsible (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val firstname: String,
    val lastname: String,
    val email: String,
    val phone_number: String,
    val reg_date: Date
)