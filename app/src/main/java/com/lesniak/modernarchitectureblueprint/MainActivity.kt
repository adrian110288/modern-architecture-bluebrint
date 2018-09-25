package com.lesniak.modernarchitectureblueprint

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyApplication.INSTANCE
            .appComponent
            .inject(this)

    }

    fun onClick(view: View) {}
}
