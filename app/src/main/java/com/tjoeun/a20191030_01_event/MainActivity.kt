package com.tjoeun.a20191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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



    }
}
