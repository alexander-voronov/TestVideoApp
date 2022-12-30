package alexander.voronov.testvideoapp.ui.preview.adapter

import alexander.voronov.testvideoapp.R
import alexander.voronov.testvideoapp.api.DataFromUrlResponseItem
import alexander.voronov.testvideoapp.databinding.ItemRecyclerviewBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation

class PosterItemViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
) {
    private val binding = ItemRecyclerviewBinding.bind(itemView)
    fun bind(dataFromUrlResponseItem: DataFromUrlResponseItem) {
        binding.previewImage.load(dataFromUrlResponseItem.small_thumbnail_url)
//        {
//            transformations(CircleCropTransformation())
//        }

    }
}