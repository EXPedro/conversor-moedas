package br.com.dio.coinconverter.data.model

//Error
data class ErrorResponse (
    val status: Long,
    val code: String,
    val message: String
)
