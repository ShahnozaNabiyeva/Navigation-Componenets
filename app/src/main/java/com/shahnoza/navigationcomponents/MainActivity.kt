package com.shahnoza.navigationcomponents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)





    }
    //bu metod navigation shu activityda boshlanadi va bizga homeFragmentni ochib beradi
    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this,R.id.my_navigation_host).navigateUp()
    }
}
//  //bu metod navigation shu activityda boshlanadi va bizga homeFragmentni ochib beradi
//        override fun onSupportNavigateUp(): Boolean {
//            return Navigation.findNavController(this,R.id.my_navigation_host).navigateUp()
//        }
//    }