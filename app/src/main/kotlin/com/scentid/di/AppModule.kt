package com.scentid.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.scentid.data.local.AppDatabase
import com.scentid.data.remote.ApiService
import com.scentid.data.repository.MyRepository
import com.scentid.ui.viewmodel.MyViewModel
import dagger.Binds
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
abstract class AppModule {

    @Module
    companion object {
        @Provides
        @Singleton
        fun provideGson(): Gson {
            return GsonBuilder().create()
        }

        @Provides
        @Singleton
        fun provideOkHttpClient(): OkHttpClient {
            return OkHttpClient.Builder().build()
        }

        @Provides
        @Singleton
        fun provideRetrofit(gson: Gson, client: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://api.example.com") // Change to your API endpoint
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
        }

        @Provides
        @Singleton
        fun provideApiService(retrofit: Retrofit): ApiService {
            return retrofit.create(ApiService::class.java)
        }

        @Provides
        @Singleton
        fun provideRoomDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_database"
            ).build()
        }

        @Provides
        @Singleton
        fun provideMyRepository(apiService: ApiService, database: AppDatabase): MyRepository {
            return MyRepository(apiService, database)
        }
        
        @Provides
        @Singleton
        fun provideMyViewModel(repository: MyRepository): MyViewModel {
            return MyViewModel(repository)
        }
    }
}