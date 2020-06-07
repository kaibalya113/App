package com.example.registrationform

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class Main2Activity : AppCompatActivity() {
    private lateinit var obtainedname: String
    private lateinit var phone:String
    private lateinit var EMA:String
    private lateinit var gen:String
    private lateinit var middlename:String
    private lateinit var addres:String
    private lateinit var lastname:String
    private lateinit var dept:String
    private lateinit var date:String
    private lateinit var month:String
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        obtainedname =intent.getStringExtra("Reference")
        phone=intent.getStringExtra("refer")
        EMA= intent.getStringExtra("email")
        gen=intent.getStringExtra("gender")
        middlename=intent.getStringExtra("middlename")
        lastname=intent.getStringExtra("lastname")
        addres=intent.getStringExtra("addess")
        dept=intent.getStringExtra("dept")



        if(gen == "male")
           hellotext.text= "Hello Mr.${obtainedname} ${middlename} ${lastname}"
        else
            hellotext.text= "Hello Miss.${obtainedname} ${middlename} ${lastname}"
        address.text="Your address is \n${addres}"
        phonee.text="Your Mobile No.:-\n${phone}"
        emaill.text="Your mail Id :-\n${EMA}"
        genn.text="Your gender is ${gen}"
        deptt.text="Your department is ${dept}"
        button.setOnClickListener {
            var intent = Intent(
                this, MainActivity2::class.java
            ).apply {
            }

            startActivity(intent)
        }
    }
}
