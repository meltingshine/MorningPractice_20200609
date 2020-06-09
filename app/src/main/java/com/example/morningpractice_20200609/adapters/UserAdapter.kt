package com.example.morningpractice_20200609.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.morningpractice_20200609.R
import com.example.morningpractice_20200609.datas.User

class UserAdapter(
    val mContext: Context,
    val resId:Int,
    val mList:List<User>) : ArrayAdapter<User>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let {
//            null이 아닐땐 그냥 지나간다 => 재활용 할 뷰가 있으니까. 새로 그리지 않는다.
        }.let {
//            tempRow가 null인 경우. => 재활용 할 뷰 X, 새로 그려야한다.

            tempRow = inf.inflate(R.layout.user_list_item, null)
        }

//        null일 가능성이 없어진 tempRow를 !!를 붙여서 row에 대입.
        val row = tempRow!!

//        실 데이터 반영 : XML의 뷰 + 데이터객체의 값

//        XML의 뷰를 가져오는 코드
        val userInfoTxt = row.findViewById<TextView>(R.id.userInfoTxt)

//        뿌려줄 줄에 맞는 데이터 값
        val data = mList[position]

//        이름 / 나이 / 성별 구해서 조합

        val age = 2020 - data.birthYear + 1

        var gender = "여성"
        if (data.gender) {
            gender="남성"
        }

        userInfoTxt.text = "${data.name}(${age}세, $gender)"


        return row
    }

}