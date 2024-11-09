package com.app.maelphrase.entities

import jakarta.persistence.*

@Entity
@Table(name = "available_languages")
data class AvailableLanguages (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val fr_fra: String,
    val fr_can: String,
    val es_usa: String,
    val es_esp: String,
    val en_usa: String,
    val en_gbr: String,
    val pt_bra: String,
    val pt_prt: String,
    val sh_chn: String
)