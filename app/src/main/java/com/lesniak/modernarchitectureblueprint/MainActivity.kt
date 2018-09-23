package com.lesniak.modernarchitectureblueprint

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.lesniak.network.api.ApiService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication)
                .appComponent
                .inject(this)
    }

    fun onClick(view: View) {}
}
