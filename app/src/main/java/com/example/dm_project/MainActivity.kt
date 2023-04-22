package com.example.dm_project

import com.example.dm_project.network.ArtistX
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
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
import com.example.dm_project.network.Artist
import com.example.dm_project.network.SpotifyAPIService
import kotlinx.android.synthetic.main.main_activity.txtId
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

private val BASE_URL = "https://spotify23.p.rapidapi.com"

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        getArtistOverview()

        val myButton = findViewById<Button>(R.id.artistbttn)
        myButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Artist::class.java)
            startActivity(intent)
        }
    }
    private fun getArtistOverview(){
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(SpotifyAPIService::class.java)

        val retrofitData = retrofitBuilder.getArtistOverview("2w9zwq3AktTeYYMuhMjju8")

//        retrofitData.enqueue(object : Callback<List<ArtistX>?> {
//
//            override fun onFailure(call: Call<List<ArtistX>?>, t: Throwable) {
//                Log.d("Main activity Failure","On Failure")
//            }
//
//            override fun onResponse(
//                call: Call<List<ArtistX>?>,
//                response: Response<List<ArtistX>?>
//            ) {
//                val responseBody = response.body()!!
//                val myStringBuilder = StringBuilder()
//                for (artist in responseBody){
//                    myStringBuilder.append(artist.name)
//                    myStringBuilder.append("\n")
//                }
//                txtId.text = myStringBuilder
//            }
//        })


    }
    fun goToArtistActivity() {
        if (applicationContext != null) {
            val intent = Intent(this@MainActivity, com.example.dm_project.Artist::class.java)
            startActivity(intent)
        } else {
            Log.e("MainActivity", "Context is null");
        }
    }
}
