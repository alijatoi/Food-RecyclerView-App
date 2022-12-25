package com.example.layoutinflator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutinflator.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values = listOf(
            Movie(1, "", "3.5", 30, 40, "waah", "gg", "horr"),
            Movie(1, "", "3.5", 30, 40, "waah", "gg", "horr"),
            Movie(1, "", "3.5", 30, 40, "waah", "gg", "horr"),
            Movie(1, "", "3.5", 30, 40, "waah", "gg", "horr")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewMovies)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter = MoviesAdapter(values)



    }

}