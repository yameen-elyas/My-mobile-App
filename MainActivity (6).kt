package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Artwork(
    val title: String,
    val artist: String,
    val year: String,
    val colorAccent: Color
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    val artworks = listOf(
        Artwork("Starry Night", "Vincent van Gogh", "1889", Color(0xFF1E3A8A)),
        Artwork("Mona Lisa", "Leonardo da Vinci", "1503", Color(0xFF78350F)),
        Artwork("The Scream", "Edvard Munch", "1893", Color(0xFFC2410C)),
        Artwork("Girl with a Pearl Earring", "Johannes Vermeer", "1665", Color(0xFF0F766E))
    )

    var currentIndex by remember { mutableStateOf(0) }

    val currentArtwork = artworks[currentIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        ArtworkWall(artwork = currentArtwork)
        Spacer(modifier = Modifier.height(24.dp))
        ArtworkDescriptor(artwork = currentArtwork)
        Spacer(modifier = Modifier.height(24.dp))
        ControllerPanel(
            onPreviousClick = {
                if (currentIndex > 0) {
                    currentIndex--
                } else {
                    currentIndex = artworks.size - 1
                }
            },
            onNextClick = {
                if (currentIndex < artworks.size - 1) {
                    currentIndex++
                } else {
                    currentIndex = 0
                }
            }
        )
    }
}

@Composable
fun ArtworkWall(artwork: Artwork) {
    Surface(
        shadowElevation = 8.dp,
        modifier = Modifier
            .size(300.dp)
            .padding(16.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(artwork.colorAccent)
        ) {
            Text(
                text = artwork.title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun ArtworkDescriptor(artwork: Artwork) {
    Surface(
        color = Color(0xFFECEFF1),
        modifier = Modifier.fillMaxWidth(0.9f)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = artwork.title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
            Row {
                Text(
                    text = artwork.artist,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = " (${artwork.year})",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

@Composable
fun ControllerPanel(onPreviousClick: () -> Unit, onNextClick: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(0.9f),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = onPreviousClick,
            modifier = Modifier.weight(1f).padding(end = 8.dp)
        ) {
            Text("Previous")
        }
        Button(
            onClick = onNextClick,
            modifier = Modifier.weight(1f).padding(start = 8.dp)
        ) {
            Text("Next")
        }
    }
}
