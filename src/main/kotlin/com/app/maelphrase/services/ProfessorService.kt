package com.app.maelphrase.services

import com.app.maelphrase.DTO.CreatProfessorDTO
import com.app.maelphrase.entities.Professor
import com.app.maelphrase.repositories.ProfesorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional    // RollBack en cas de données corrompues
class ProfessorService {
    @Autowired
    private lateinit var professorRepository: ProfesorRepository
    fun creatProfessor(professor: CreatProfessorDTO): Professor{
        val prof = Professor(
            id = 0,
            first_name = professor.firstname,
            last_name = professor.lastname,
            email = professor.email,
            password = professor.password,
            activities_id = 0,
            classroom_id = 0,
            reg_date = Date()
        )

    return professorRepository.save(
        prof
    )

    }
}