package com.example.dm_project

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
//    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity);

        val myButton = findViewById<Button>(R.id.artistbttn)
        myButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Artist::class.java)
            startActivity(intent)
        }
    }


    fun goToArtistActivity() {
        if (applicationContext != null) {
            val intent = Intent(this@MainActivity, Artist::class.java)
            startActivity(intent)
        } else {
            Log.e("MainActivity", "Context is null");
        }
    }
}

//@Composable
//fun ArtistNameTextView(artistName: String, modifier: Modifier = Modifier) {
//    Text(
//        text = artistName,
//        modifier = modifier
//    )
//}
//
//@Composable
//fun ArtistDescriptionTextView(artistDescription: String, modifier: Modifier = Modifier) {
//    Text(
//        text = artistDescription,
//        modifier = modifier
//    )
//}
//
//@Composable
//fun ArtistImage(imageResId: Int) {
//    val painter: Painter = painterResource(id = imageResId)
//    Image(painter = painter, contentDescription = null)
//}
//
//@Composable
//fun ArtistAlbums(albums: List<String>) {
//    LazyColumn {
//        items(albums) { album ->
//            Text(text = album, modifier = Modifier.padding(16.dp))
//        }
//    }
//}
