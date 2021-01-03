package com.talabat.designsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talabat.marshmellolib.TestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestClass().print()
    }
}