package com.example.myapplication.vsChose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class vsPcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vs_pc)

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

        // masih blm bisa nerima recived data nama pemain dari thirdScreen
       /* val player = findViewById<TextView>(R.id.pemain)
        player.text.*/

        fun UserChoice() {

            val gunting = findViewById<ImageView>(R.id.player_gunting)
            gunting.setOnClickListener {
                val message = "player_gunting"
            }

            val batu = findViewById<ImageView>(R.id.player_batu)
            batu.setOnClickListener {
                val message = "player_batu"
            }

            val kertas = findViewById<ImageView>(R.id.player_kertas)
            kertas.setOnClickListener {
                val message = "player_kertas"
            }
        }
        val userChoice = UserChoice().toString()

            /*fun sendMessageGunting () {
        val playerGunting = findViewById<ImageView>(R.id.player_gunting)
        val message = "player_gunting"
    }
    fun sendMessageBatu () {
        val playerGunting = findViewById<ImageView>(R.id.player_gunting)
        val message = "player_batu"
    }
    fun sendMessageKertas () {
        val playerGunting = findViewById<ImageView>(R.id.player_gunting)
        val message = "player_kertas"*/

            //batas==========================================================================================


            fun generatedChoice(): String {
                val list = (0..2)
                val choice = list.shuffled().take(1)[0]
                val gbk = arrayOf("com_gunting", "com_batu", "com_kertas")
                return gbk.elementAtOrElse(choice) { index -> "The Value for Index $index is undefined " }
            }

            val compChoice = generatedChoice()


            var display: String
            when {
                (userChoice == "player_batu" && compChoice == "com_kertas") -> display = "kalah"
                (userChoice == "player_gunting" && compChoice == "com_batu") -> display = "kalah"
                (userChoice == "player_kertas" && compChoice == "com_gunting") -> display = "kalah"
                (userChoice == "player_batu" && compChoice == "com_batu") -> display = "seri"
                (userChoice == "player_gunting" && compChoice == "com_gunting") -> display = "seri"
                (userChoice == "player_kertas" && compChoice == "com_kertas") -> display = "seri"
                else -> display = "menang"
            }

        }
    }