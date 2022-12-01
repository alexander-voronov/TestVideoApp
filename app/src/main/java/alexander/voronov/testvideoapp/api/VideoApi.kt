package alexander.voronov.testvideoapp.api


import retrofit2.http.GET
import retrofit2.http.Path

interface VideoApi {

    @GET("api/backgrounds/?group=video&category_id=1")
    suspend fun videoFromUrl(@Path("id") id: String): String

    @GET("api/backgrounds/?group=video&category_id=1")
    suspend fun posterFromUrl(): DataFromUrlResponseItem
}