package com.netoprojects.estoquedematerial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit")
        println("Local change")
        println("Experimental")

    }
}