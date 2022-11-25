package com.naji.movienaji.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import com.naji.movienaji.data.api.NetworkService
import com.naji.movienaji.utils.CONSTANTS
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class ApiModule {

    @Provides
    @Singleton
    operator fun invoke() : NetworkService {
        return Retrofit.Builder()
                .baseUrl(CONSTANTS.BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NetworkService::class.java)
    }


}