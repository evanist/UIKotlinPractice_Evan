package com.example.uikotlinpractice_evan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if confirmBtn.setOnClickListener {
            putiD = admin@test.com
            putPW = 123456
        }

        Toast.makeText("관리자 입니다.", Toast.LENGTH_SHORT).show()

        else

        Toast.makeText("로그인 실패", Toast.LENGTH_SHORT).show()

    }
}