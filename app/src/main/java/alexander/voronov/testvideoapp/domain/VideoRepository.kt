package alexander.voronov.testvideoapp.domain

import alexander.voronov.testvideoapp.api.DataFromUrlResponseItem

interface VideoRepository {

    suspend fun posterFromUrl(): DataFromUrlResponseItem
}