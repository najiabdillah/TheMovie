package com.naji.movienaji.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import com.naji.movienaji.data.local.BookmarkDatabase
import javax.inject.Singleton



@Module
@InstallIn(ApplicationComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application) = BookmarkDatabase.getInstance(application)

    @Provides
    @Singleton
    fun provideBookmarkDao(database: BookmarkDatabase) = database.getBookmarkDao()

}