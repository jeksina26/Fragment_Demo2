package com.example.fragment_demo2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_2.*
import kotlinx.android.synthetic.main.fragment_3.*
import kotlinx.android.synthetic.main.fragment_4.*
import kotlinx.android.synthetic.main.fragment_5.*
import kotlinx.android.synthetic.main.fragment_6.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadfragment1(Fragment1())
        btn1.setOnClickListener {
            loadfragment1(Fragment1())
        }

        btn2.setOnClickListener {
            loadfragment2(Fragment2())
        }

        btn3.setOnClickListener {
            loadfragment3(Fragment3())
        }

        btn4.setOnClickListener {
            loadfragment4(Fragment4())
        }

        btn5.setOnClickListener {
            loadfragment5(Fragment5())
        }

        btn6.setOnClickListener {
            loadfragment6(Fragment6())
        }
    }

    private fun loadfragment1(frag : Fragment1){
        val f1 = supportFragmentManager.beginTransaction()
        f1.replace(R.id.fragment,frag)
        f1.commit()
    }

    private fun loadfragment2(frag2 : Fragment2){
        val f1 = supportFragmentManager.beginTransaction()
        f1.replace(R.id.fragment,frag2)
        f1.commit()
    }

    private fun loadfragment3(frag3 : Fragment3){
        val f1 = supportFragmentManager.beginTransaction()
        f1.replace(R.id.fragment,frag3)
        f1.commit()
    }

    private fun loadfragment4(frag4 : Fragment4){
        val f1 = supportFragmentManager.beginTransaction()
        f1.replace(R.id.fragment,frag4)
        f1.commit()
    }

    private fun loadfragment5(frag5 : Fragment5){
        val f1 = supportFragmentManager.beginTransaction()
        f1.replace(R.id.fragment,frag5)
        f1.commit()
    }

    private fun loadfragment6(frag6 : Fragment6){
        val f1 = supportFragmentManager.beginTransaction()
        f1.replace(R.id.fragment,frag6)
        f1.commit()
    }
}