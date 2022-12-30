package alexander.voronov.testvideoapp.ui.preview

import alexander.voronov.testvideoapp.ui.preview.adapter.PosterListAdapter
import alexander.voronov.testvideoapp.databinding.FragmentPreviewBinding
import alexander.voronov.testvideoapp.ui.preview.adapter.ClickOnPosterList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

class PreviewFragment : Fragment() {
    private var _binding: FragmentPreviewBinding? = null
    private val binding get() = _binding!!
    private val adapter: PosterListAdapter = PosterListAdapter(object : ClickOnPosterList {
        override fun onClick(id: String) {
            val data = Bundle().apply {
                putString(PosterListAdapter.)
            }
        }

    })

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPreviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.previewRecyclerview.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.previewRecyclerview.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}