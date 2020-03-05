package com.ccf.wc.home

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = FrameLayout(this)
        layout.id = android.R.id.content + 1
        setContentView(layout)

        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content + 1, HomeFragment())
            .commit()
    }
}