package com.example.morningpractice_20200609.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.morningpractice_20200609.fragments.StudentListFragment
import kr.co.tjoeun.fragmenttest_20200608.fragments.MyProfileFragment

class MyAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "프로필 화면"
            else -> "수강생 목록"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MyProfileFragment()
            else -> StudentListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}