package com.example.codemasterclass

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import android.widget.Button
import android.widget.ImageButton
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
import androidx.fragment.app.Fragment
import com.example.codemasterclass.ui.theme.CODEMASTERCLASSTheme
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    instance
        val btnHome: ImageButton = findViewById(R.id.buttonHome)
        val btnKelas: ImageButton = findViewById(R.id.buttonKelas)
//        val btnUpload: ImageButton = findViewById(R.id.buttonUpload)
//        val btnKarya: ImageButton = findViewById(R.id.buttonKarya)
//        val btnProfil: ImageButton = findViewById(R.id.buttonProfil)


//        event saat button Fairy diklik
        btnHome.setOnClickListener {
            replaceFragment(HomeFragment())
        }
//        event saat button Fable diklik
        btnKelas.setOnClickListener {
            replaceFragment(KelasFragment())
        }
////        event saat button Science diklik
//        btnUpload.setOnClickListener {
//            replaceFragment(Uploadfragment())
//        }
//    //        event saat button Science diklik
//        btnKarya.setOnClickListener {
//            replaceFragment(Uploadfragment())
//        }
//
////        event saat button Science diklik
//        btnUpload.setOnClickListener {
//            replaceFragment(Uploadfragment())
//        }
    }
    private fun replaceFragment(frg: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentMain, frg)
        fragmentTrx.commit()
    }

}