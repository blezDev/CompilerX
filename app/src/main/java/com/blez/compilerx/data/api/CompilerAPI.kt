package com.blez.compilerx.data.api

import com.blez.compilerx.data.model.CodeBody
import retrofit2.http.Body
import retrofit2.http.POST

interface CompilerAPI {
    @POST("/compile/ccompile")
    suspend fun cCompile(@Body code : CodeBody)

    @POST("/compile/javacompile")
    suspend fun javaCompile(@Body code : CodeBody)

    @POST("/compile/pythoncompile")
    suspend fun pythonCompile(@Body code : CodeBody)
}