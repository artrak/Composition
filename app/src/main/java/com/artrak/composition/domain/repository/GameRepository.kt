package com.artrak.composition.domain.repository

import com.artrak.composition.domain.entity.GameSettings
import com.artrak.composition.domain.entity.Level
import com.artrak.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}