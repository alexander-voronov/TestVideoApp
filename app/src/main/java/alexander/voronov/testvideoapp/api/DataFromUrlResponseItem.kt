package alexander.voronov.testvideoapp.api

data class DataFromUrlResponseItem(
    val color: Any,
    val file_url: String,
    val group: String,
    val id: String,
    val is_favorite: Boolean,
    val poster_url: String,
    val small_poster_url: String,
    val small_thumbnail_url: String,
    val thumbnail_url: String
)