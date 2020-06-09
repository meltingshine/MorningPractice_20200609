package com.example.morningpractice_20200609.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.morningpractice_20200609.R
import com.example.morningpractice_20200609.adapters.UserAdapter
import com.example.morningpractice_20200609.datas.User
import kotlinx.android.synthetic.main.fragment_student_list.*

class StudentListFragment : BaseFragment() {

    val studentList = ArrayList<User>()
    lateinit var userAdapter : UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        addStudents()
        userAdapter = UserAdapter(mContext, R.layout.user_list_item, studentList)
        studentListView.adapter = userAdapter
    }

    fun addStudents() {
        studentList.add(User("조경진", 1988, true))
        studentList.add(User("김미영", 2010, false))
        studentList.add(User("김성우", 1982, true))
        studentList.add(User("김형근", 1989, true))
        studentList.add(User("이용희", 1992, true))
        studentList.add(User("이지수", 1984, false))
    }

}