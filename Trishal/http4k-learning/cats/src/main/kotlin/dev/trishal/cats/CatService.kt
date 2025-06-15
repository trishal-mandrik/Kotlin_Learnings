package dev.trishal.cats

import java.time.Clock
import java.time.Instant
import java.util.UUID
import kotlin.random.Random

private const val UUID_LENGTH = 40

class CatService(
    private val clock: Clock,
    private val random: Random,
) {

    private val cats = mutableListOf<Cat>()
    fun getCat(id: UUID): Cat? {
        return cats.find { it.id == id }
    }

    fun listCats(): List<Cat> {
        return cats.toList()
    }

    fun deleteCat(id: UUID): Cat? {
        val cat = cats.find { it.id == id }
        if (!cats.remove(cat)) return null
        return cat
    }

    fun createCat(data: CatData): Cat {
        val bytes = random.nextBytes(UUID_LENGTH)
        val cat = Cat(
            id = UUID.nameUUIDFromBytes(bytes),
            createdAt = clock.instant(),
            name = data.name,
            breed = data.breed,
            color = data.color,
            dateOfBirth = data.dateOfBirth,
        )
        cats += cat
        return cat
    }
}