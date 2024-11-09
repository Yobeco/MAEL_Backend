package com.app.maelphrase.controllers

import com.app.maelphrase.DTO.CreatProfessorDTO
import com.app.maelphrase.entities.Professor
import com.app.maelphrase.services.ProfessorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController              // C'est ici que JS va trouver les données
@RequestMapping("/api/professor")              // Définir nom du controleur
class ProfessorController {
    @Autowired        // Injection de dépendances
    private lateinit var professorService: ProfessorService
    @PostMapping
    fun creatProfessor(
        @RequestBody dto: CreatProfessorDTO
    ): ResponseEntity<Professor>{
        val createdProfesor = professorService.creatProfessor(dto)
        return if (createdProfesor != null){
            ResponseEntity(createdProfesor, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

}