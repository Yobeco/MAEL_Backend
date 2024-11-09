package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "category")

data class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name_id: Long,       // Nom différent selon la langue du contexte
    val col: String,      // la colonne "Classeurs", "Activités" ou "Élèves"
    val creat_date: Date
)