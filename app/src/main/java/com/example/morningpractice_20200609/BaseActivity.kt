package com.example.morningpractice_20200609

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this
    abstract fun setupEvents()
    abstract fun setValues()
}