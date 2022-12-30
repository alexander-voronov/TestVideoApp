package alexander.voronov.testvideoapp.ui.preview.adapter

import alexander.voronov.testvideoapp.api.DataFromUrlResponseItem
import alexander.voronov.testvideoapp.databinding.ItemRecyclerviewBinding
import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PosterListAdapter(private val onClick: ClickOnPosterList) :
    RecyclerView.Adapter<PosterItemViewHolder>() {

    private val posterList = mutableListOf<DataFromUrlResponseItem>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosterItemViewHolder =
        PosterItemViewHolder(parent)

    override fun onBindViewHolder(holder: PosterItemViewHolder, position: Int) {
        holder.bind(posterList[position])
        val binding = ItemRecyclerviewBinding.bind(holder.itemView)
        binding.previewImage.setOnClickListener {
            onClick.onClick(posterList[position].id)
        }

    }

    override fun getItemCount(): Int = posterList.size

    @SuppressLint("NotifyDataSetChanged")
    fun updatePosterList(posterList: List<DataFromUrlResponseItem>) {
        this.posterList.clear()
        this.posterList.addAll(posterList)
        notifyDataSetChanged()
    }
}