package com.example.myapplication.vsChose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.myapplication.R

class ChoseEnemyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_enemy)

        val vsPlayer = findViewById<ImageView>(R.id.vsPlayer)
        vsPlayer.setOnClickListener {
            val Intent = Intent(this, vsPlayer::class.java)
            startActivity(Intent)

            val vsPC = findViewById<ImageView>(R.id.vsPC)
            vsPC.setOnClickListener {
                val Intent = Intent(this, vsPcActivity::class.java)
                startActivity(Intent)

            }
        }
    }
}