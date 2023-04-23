package com.example.dm_project

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArtistInformation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artist)

        // Find the TextViews in the layout by their IDs
        val artistNameTextView = findViewById<TextView>(R.id.artist_name)
        val artistDescriptionTextView = findViewById<TextView>(R.id.artist_description)

        // Set the text of the TextViews
        artistNameTextView.text = getString(R.string.sample_artist_name)
        artistDescriptionTextView.text = getString(R.string.lorem_ipsum_dolor_sit_amet_consectetur_adipiscing_elit_pellentesque_efficitur_vel_augue_sit_amet_consectetur)
    }
}



