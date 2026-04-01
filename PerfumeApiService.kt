package com.scentid.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PerfumeApiService {

    @GET("perfumes/search")
    suspend fun searchPerfumes(
        @Query("q") query: String
    ): List<PerfumeResponse>

    @GET("perfumes/trending")
    suspend fun getTrendingPerfumes(): List<PerfumeResponse>

    @GET("perfumes/{id}")
    suspend fun getPerfumeDetail(
        @Path("id") perfumeId: String
    ): PerfumeDetailResponse

    @GET("perfumes/{id}/recommendations")
    suspend fun getRecommendations(
        @Path("id") perfumeId: String
    ): List<PerfumeResponse>

    @GET("perfumes/scan")
    suspend fun scanPerfume(
        @Query("barcode") barcode: String
    ): PerfumeResponse?
}

data class PerfumeResponse(
    val id: String,
    val name: String,
    val brand: String,
    val imageUrl: String,
    val rating: Double,
    val voteCount: Int
)

data class PerfumeDetailResponse(
    val id: String,
    val name: String,
    val brand: String,
    val year: Int,
    val imageUrl: String,
    val topNotes: List<String>,
    val heartNotes: List<String>,
    val baseNotes: List<String>,
    val rating: Double,
    val voteCount: Int,
    val gender: String,
    val sillage: String,
    val longevity: String,
    val seasons: List<String>
)