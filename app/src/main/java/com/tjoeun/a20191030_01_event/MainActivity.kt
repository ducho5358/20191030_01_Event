package com.tjoeun.a20191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // xml에 그려진 초기 값 이라고 적힌 텍스트뷰의 글자를

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTextView.text = "실행 후"

        okBtn.setOnClickListener {
            firstTextView.text = "확인버튼 클릭됨"
        }


        okBtn.setOnLongClickListener {

            firstTextView.text = "확인버튼 롱클릭"

            return@setOnLongClickListener true
        }

        // @라벨 에 대한 예시. 책 49p.

        firstFor@ for (i in 0..10) {
            secondFor@ for (j in 0..10) {

                if (j==2) {
                    break@firstFor
                }
            }
        }


        var stringList:ArrayList<String> = ArrayList()

        // "오덕호" 글자를 추가.

        stringList.add("오덕호")
        // " 황진호" 글자를 추가.
        stringList.add("황진호")
        // " 구민성" 글자를 추가.
        stringList.add("구민성")

        var intList:ArrayList<Int> = ArrayList()
        intList.add(10)
        intList.add(20)
        intList.add(50)


        // 구민성은 몇번째로 넣었을까? 어느 위치에?

        val indexOfKoo = stringList.indexOf("구민성")




        var a = 10
        var b = 20

        var c = if (a=b) {
            Log.d("로그", "둘이 같다")

        } else {
            Log.d("로그", "둘이 다르다.")

        }

        when(a) {
            0, 1 -> Log.d("when연습", " a가 0이나 1이다")
            in 2..5 -> Log.d("when연습", " a가 2~5이다")
            in intList -> Log.d("when연습", " a가 intList에 포함")
            !in intList -> Log.d("when연습", " a가 intList 불포함 이다")
        }


        for(name in stringList) {
            Log.d("사람이름", name)

        }

        for (i in 0..5) {
         Log.d("숫자 찍기", String.format("%d", i))
        }


        }



    }
}
