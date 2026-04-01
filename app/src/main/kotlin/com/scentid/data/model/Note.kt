package com.scentid.data.model

data class Note(
    val name: String,
    val imageUrl: String,
    val gender: Gender,
    val sillageLevel: SillageLevel,
    val longevityLevel: LongevityLevel,
    val season: Season
)

enum class Gender {
    FEMININE,
    MASCULINE,
    UNISEX
}

enum class SillageLevel {
    SOFT,
    MODERATE,
    STRONG,
    ENORMOUS
}

enum class LongevityLevel {
    POOR,
    WEAK,
    MODERATE,
    LONG_LASTING,
    VERY_LONG
}

enum class Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}