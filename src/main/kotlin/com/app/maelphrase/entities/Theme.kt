package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "theme")

data class Theme (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name_id: Long,          // Nom différent selon la langue du contexte
    val img_url_id : Long,      // Image différente selon la langue du contexte
    val color: String,
    val cards_id: Long,         // Cartes que le thème contient
    val categories_id: Long,    // Catégorie où est rangé le Thème
    val binder_id: Long,        // Classeur contenant le thème
    val creat_date: Date
)