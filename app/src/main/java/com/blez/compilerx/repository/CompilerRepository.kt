package com.blez.compilerx.repository

import com.blez.compilerx.data.api.CompilerAPI
import com.blez.compilerx.data.model.CodeBody

class CompilerRepository(val api: CompilerAPI) {
    suspend fun cCompile(code : CodeBody) = api.cCompile(code)
    suspend fun javaCompile(code: CodeBody) = api.javaCompile(code)

    suspend fun python(code: CodeBody) = api.pythonCompile(code)

}