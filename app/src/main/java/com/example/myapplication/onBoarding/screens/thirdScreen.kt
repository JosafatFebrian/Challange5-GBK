package com.example.myapplication.onBoarding.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import kotlin.math.log

const val NAMA_PLAYER = "nama player"

class thirdScreen : Fragment() {

    lateinit var editText: EditText
    lateinit var mulai: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third_screen, container, false)

        editText = view?.findViewById(R.id.etName) as EditText
        mulai = view?.findViewById(R.id.Mulai) as TextView
        var namaPemain = ""

        mulai.setOnClickListener({
            namaPemain = editText.text.toString()
            Toast.makeText(getActivity()?.getApplicationContext() ?: , "$namaPemain", Toast.LENGTH_SHORT).show()
        })




        /*var nama =""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_screen, container, false)
        val etNameData = view?.findViewById<EditText> (R.id.etName) as EditText
        val mulai = view?.findViewById<TextView>(R.id.Mulai) as TextView

        mulai.setOnClickListener() {
            nama = etNameData.text.toString()
            Log.d("nama",etNameData.text.toString())
        }
    }*/
    }
}


