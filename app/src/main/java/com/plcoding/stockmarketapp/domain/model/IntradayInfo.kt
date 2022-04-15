package com.plcoding.stockmarketapp.domain.model

import com.squareup.moshi.Json
import java.time.LocalDateTime

data class IntradayInfo(
    val date: LocalDateTime,
    val close : Double
)
