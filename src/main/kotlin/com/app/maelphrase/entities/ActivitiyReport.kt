package com.app.maelphrase.entities

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "activity_report")
data class ActivitiyReport (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val students_id : Long,
    val activity_id: Long,
    val selected_words: String,   // ENUM() ?
    val ia_phrase: String,
    val ia_evaluation: Int,
    val url_audios: String,   // ENUM() ?
    val creat_date: Date
)

