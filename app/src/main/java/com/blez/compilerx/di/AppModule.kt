package com.blez.compilerx.di

import com.blez.compilerx.data.api.CompilerAPI
import com.blez.compilerx.repository.CompilerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesCompilerRepository(compilerAPI : CompilerAPI) : CompilerRepository{
        return CompilerRepository(compilerAPI)
    }

}