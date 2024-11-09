package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "binder")
data class Binder (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name_id: Long,    // Nom différent selon la langue du contexte
    val img_url_id: Long,
    val color: String,
    val themes_id: Long,
    val categories_id: Long,
    val creat_date: Date
)