package alexander.voronov.testvideoapp.ui.video

import alexander.voronov.testvideoapp.databinding.FragmentVideoBinding
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class VideoFragment : Fragment() {
    private var _binding: FragmentVideoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val videoSource =
            "https://storage.googleapis.com/assets-stage-bgrem-deelvin-com/bg/videos/051d0387-3098-4b1a-81c4-bcd8f5516cc4/preview-u5z128qp.mp4"
        binding.viewVideo.setVideoURI(Uri.parse(videoSource))

        binding.viewVideo.setOnPreparedListener { mediaPlayer ->
            mediaPlayer.isLooping = true
        }
        binding.viewVideo.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}