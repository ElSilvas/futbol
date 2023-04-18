package com.example.fultbol.controller

import com.example.fultbol.model.Player
import com.example.fultbol.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController {
    @Autowired
    lateinit var playerService: PlayerService
@GetMapping

    fun list():List<Player>{
        return playerService.list()
    }

    @PostMapping

    fun save(@RequestBody player:Player):Player{
        return playerService.save(player)

}
}