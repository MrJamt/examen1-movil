package com.ucb.framework.book.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookResponseDto(
    @Json(name = "docs")
    val docs: List<BookDto>,
)
