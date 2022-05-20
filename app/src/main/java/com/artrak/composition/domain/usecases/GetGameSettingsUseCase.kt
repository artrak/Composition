package com.artrak.composition.domain.usecases

import com.artrak.composition.domain.entity.GameSettings
import com.artrak.composition.domain.entity.Level
import com.artrak.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}