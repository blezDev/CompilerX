package com.blez.compilerx.di

import com.blez.compilerx.data.api.CompilerAPI
import com.blez.compilerx.repository.CompilerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesCompilerAPI(okHttpClient: OkHttpClient) : CompilerAPI{
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(CompilerAPI::class.java)
    }


    @Provides
    @Singleton
    fun providesCompilerRepository(compilerAPI : CompilerAPI) : CompilerRepository{
        return CompilerRepository(compilerAPI)
    }

}