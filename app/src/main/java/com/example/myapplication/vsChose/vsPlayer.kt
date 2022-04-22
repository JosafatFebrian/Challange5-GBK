package com.example.myapplication.vsChose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.myapplication.R

class vsPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vs_player)

        val refresh = findViewById<ImageView>(R.id.refresh)
        refresh.setOnClickListener {
            finish();
            startActivity(getIntent());
        }

        val close = findViewById<ImageView>(R.id.close)
        close.setOnClickListener{
            val Intent = Intent(this, ChoseEnemyActivity::class.java)
            startActivity(Intent)
        }

        // val player = findViewById<TextView>()

        fun Player1() {

            val gunting = findViewById<ImageView>(R.id.player_gunting)
            gunting.setOnClickListener {
                val message = "player1_gunting"
            }

            val batu = findViewById<ImageView>(R.id.player_batu)
            batu.setOnClickListener {
                val message = "player1_batu"
            }

            val kertas = findViewById<ImageView>(R.id.player_kertas)
            kertas.setOnClickListener {
                val message = "player1_kertas"
            }
        }

        val player1Choice = Player1().toString()

        fun Player2() {

            val gunting = findViewById<ImageView>(R.id.player_gunting)
            gunting.setOnClickListener {
                val message = "player2_gunting"
            }

            val batu = findViewById<ImageView>(R.id.player_batu)
            batu.setOnClickListener {
                val message = "player2_batu"
            }

            val kertas = findViewById<ImageView>(R.id.player_kertas)
            kertas.setOnClickListener {
                val message = "player2_kertas"
            }
        }

        val player2Choice = Player2().toString()

        var display: String
        when {
            (player1Choice == "player1_batu" && player2Choice == "player2_kertas") -> display =
                "kalah"
            (player1Choice == "player1_gunting" && player2Choice == "player2_batu") -> display =
                "kalah"
            (player1Choice == "player1_kertas" && player2Choice == "player2_gunting") -> display =
                "kalah"
            (player1Choice == "player1_batu" && player2Choice == "player2_batu") -> display = "seri"
            (player1Choice == "player1_gunting" && player2Choice == "player2_gunting") -> display =
                "seri"
            (player1Choice == "player1_kertas" && player2Choice == "player2_kertas") -> display =
                "seri"
            else -> display = "menang"
        }


    }
}