package com.papayacoders.deeplinking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val uri = intent.data

        if (uri != null){
            val path = uri.toString()
            Toast.makeText(this, "Data : $path", Toast.LENGTH_LONG).show()
        }
    }
}