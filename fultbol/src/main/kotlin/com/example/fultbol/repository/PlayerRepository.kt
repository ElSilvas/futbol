package com.example.fultbol.repository

import com.example.fultbol.model.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository:JpaRepository<Player, Long> {
}