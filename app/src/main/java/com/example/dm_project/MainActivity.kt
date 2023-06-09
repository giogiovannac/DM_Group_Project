package com.example.dm_project

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.dm_project.ui.theme.DM_ProjectTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DM_ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val artistName = ArtistNameTextView("Taylor Swift")
                    val artistDesc = ArtistDescriptionTextView("Lorem Ipsum")
                    val artistImage = ArtistImage(imageResId = R.drawable.ic_launcher_background)

//                    Column(Modifier.padding(16.dp)) {
//                        Artist(name = "Artist Name")
//                        ArtistImage(image = R.drawable.artist_image)
//                        Artist(description = "Artist Description")
//                        ArtistAlbums(albums = listOf("Album 1", "Album 2", "Album 3"))
//                    }
                }
            }
        }
    }
}

@Composable
fun ArtistNameTextView(artistName: String, modifier: Modifier = Modifier) {
    Text(
        text = artistName,
        modifier = modifier
    )
}

@Composable
fun ArtistDescriptionTextView(artistDescription: String, modifier: Modifier = Modifier) {
    Text(
        text = artistDescription,
        modifier = modifier
    )
}

@Composable
fun ArtistImage(imageResId: Int) {
    val painter: Painter = painterResource(id = imageResId)
    Image(painter = painter, contentDescription = null)
}

@Composable
fun ArtistAlbums(albums: List<String>) {
    LazyColumn {
        items(albums) { album ->
            Text(text = album, modifier = Modifier.padding(16.dp))
        }
    }
}
