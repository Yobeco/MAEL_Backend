package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "card")
data class Card (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name_id: Long,          // Nom différent selon la langue du contexte
    val img_url_id : Long,      // Image différente selon la langue du contexte
    val theme_id: Long,         // Classeur contenant le thème
    val creat_date: Date
)