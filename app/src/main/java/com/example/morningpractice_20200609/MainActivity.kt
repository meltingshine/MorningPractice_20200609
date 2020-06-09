package com.example.morningpractice_20200609

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.morningpractice_20200609.adapters.MyAdapter

class MainActivity : BaseActivity() {

    lateinit var myAdapter : MyAdapter

    override fun setupEvents() {

    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()


    }
}