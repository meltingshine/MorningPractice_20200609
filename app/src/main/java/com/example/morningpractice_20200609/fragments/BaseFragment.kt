package com.example.morningpractice_20200609.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    lateinit var mContext : Context

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mContext = activity as Context //this로 하면 Context로 못먹으니까 하는 짓
    }

    abstract fun setupEvents()
    abstract fun setValues()

}