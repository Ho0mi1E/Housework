package com.example.homework1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val btn by lazy { findViewById<Button>(R.id.btn) }
    private val firstName by lazy { findViewById<EditText>(R.id.firstName) }
    private val secondName by lazy { findViewById<EditText>(R.id.secondName) }
    private val age by lazy { findViewById<EditText>(R.id.age) }
    private val textView by lazy { findViewById<TextView>(R.id.text) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        initView()

    }

    private fun initView(){
        btn.setOnClickListener {
            if (firstName.text.toString() == "" || secondName.text.toString() == "" || age.text.toString() == "")
            {
                showToast("Ошибка, есть незаполненые поля")

            }
            else{
            val user = User(firstName.text.toString(),secondName.text.toString(),age.text.toString())
            val text = "Тебя зовут " + user.userName + " " + user.secondName + ". Тебе " + user.age
            textView.text = text



        }



    }
    }

    private fun showToast(message: String){
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()

    }


}