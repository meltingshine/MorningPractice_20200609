package kr.co.tjoeun.fragmenttest_20200608.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.morningpractice_20200609.MainActivity
import com.example.morningpractice_20200609.R
import com.example.morningpractice_20200609.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_my_profile.*


class MyProfileFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
        //이걸로 화면을 그린다.
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        changeBtn.setOnClickListener {
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)
        }

        dialBtn.setOnClickListener {

//            String 가공시 text변수들은 묶여서 자동으로 String으로 변환됨.
//            굳이 toString을 한번 더 호출할 필요가 없다.
            val myUri = Uri.parse("tel:${phoneNumEdt.text}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

    }


}