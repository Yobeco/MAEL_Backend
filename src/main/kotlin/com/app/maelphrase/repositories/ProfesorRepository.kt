package com.app.maelphrase.repositories

import com.app.maelphrase.entities.Professor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfesorRepository : JpaRepository<Professor, Long> {     // ID renvoyé au format Long

    fun creatProfessor()

}