package com.mkrdeveloper.videoplayercompose

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mkrdeveloper.videoplayercompose.ui.theme.VideoPlayerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val videoUrl = "rtsp://172.20.1.88/av0_0"
        val videoUrl = "rtsp://172.20.1.88/av0_1"
//         val videoUrl = "rtsp://fake.kerberos.io/stream"
        setContent {
            VideoPlayerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        /*YouTubePlayer(
                            youtubeVideoId = "kShAS6aafOU",
                            lifecycleOwner = LocalLifecycleOwner.current
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        VideoPlayer(videoUri =videoUri)*/
                        VideoPlayerExo(videoUrl =videoUrl)
//                        VideoPlayer(videoUri = Uri.parse("http://82.166.176.26:8554/bla"))

                    }
                }
            }
        }
    }
}

