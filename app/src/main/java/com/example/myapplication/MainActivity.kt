package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.onBoarding.screens.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        val fragment: ArrayList<Fragment> = arrayListOf(
            firstScreen(),
            seccondScreen(),
            thirdScreen()
        )

        val adapter = viewPagerAdapter(fragment, this)
        viewPager.adapter = adapter

    }
}


/*private  lateinit var viewPagerAdapter : viewPagerAdapter

       val viewPager = findViewById<>(R.id.viewPager)


       viewPagerAdapter = viewPagerAdapter(supportFragmentManager)

       // eror di sini kenapa gak kepanggi ID "viewPager" dari activity main xml nya?
       viewPager.adapter = viewPagerAdapter

   }

   override fun SendMassage(massage: String?) {

       val tag = "android:switcher"+ R.id.viewPager.toString()+ ":" + 1
       val f = supportFragmentManager.findFragmentByTag(tag) as thirdScreen

       // nanti di class yang menerima data di tambahkan "fun displayRecivedData(msg:String?)"
       f.displayRecivedData (massage!!)
       var currentItem = getItem(+1)
       // eror di sini kenapa gak kepanggi ID "viewPager" dari activity main xml nya?
       viewPager.currentItem = currentItem



   }
   // eror di sini kenapa gak kepanggi ID "viewPager" dari activity main xml nya?
   fun getItem (i:Int)= viewPager.currentItem + i*/
