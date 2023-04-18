package com.example.fultbol.service

import com.example.fultbol.model.Player
import com.example.fultbol.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlayerService {
    @Autowired
    lateinit var  playerRepository: PlayerRepository
    fun list():List<Player>{
        return playerRepository.findAll()
    }
    fun save(player:Player):Player{
        return playerRepository.save(player)
    }

}