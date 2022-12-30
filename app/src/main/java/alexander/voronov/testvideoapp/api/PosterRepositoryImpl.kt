package alexander.voronov.testvideoapp.api

import alexander.voronov.testvideoapp.domain.PosterRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class PosterRepositoryImpl : PosterRepository {

    private val api: VideoApi by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://dev.bgrem.deelvin.com/")
            .client(OkHttpClient.Builder().apply {
                addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            }
                .build()
            )
            .build()
            .create(VideoApi::class.java)
    }

    override suspend fun posterFromUrl(): DataFromUrlResponseItem = api.posterFromUrl()
    //override suspend fun videoOnClick()  = api.videoFromUrl(file_url)

}