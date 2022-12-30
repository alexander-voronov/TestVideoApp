package alexander.voronov.testvideoapp.domain

import alexander.voronov.testvideoapp.api.DataFromUrlResponseItem

interface PosterRepository {

    suspend fun posterFromUrl(): DataFromUrlResponseItem
    //suspend fun videoOnClick()
}