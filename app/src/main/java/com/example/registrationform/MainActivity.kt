package com.example.registrationform

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year


class MainActivity : AppCompatActivity() {
    var name = ""
    var phno = ""
    var email=""
    var gender=""
    var middleName=""
    var lastname=""
    var addres=""
    var dept=""


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var deptList= arrayListOf("Computer Science","Mecanical","Civil","Electrical","ENTC","IT","computer science")


        deptsp.adapter=ArrayAdapter(
            this, android.R.layout.simple_spinner_item,deptList)


        SendButton.setOnClickListener {
            getData(nameTextBox.text.toString(),phonoText.text.toString(), Email.text.toString(),nameTextBox2.text.toString(),nameTextBox3.text.toString(),nameTextBox4.text.toString())
            Toast.makeText(applicationContext,name,Toast.LENGTH_SHORT).show()
            var genderId = GenderRadioGroup.checkedRadioButtonId
            if(genderId != -1){
                val selected_gender : RadioButton = findViewById(genderId)
                gender = selected_gender.text.toString()
            }

            deptsp.onItemSelectedListener=
                object :AdapterView.OnItemSelectedListener{
                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        dept= deptList[position]
                    }
                }



            var intent =Intent(

               this,Main2Activity::class.java).apply {

                putExtra("Reference", name)
                putExtra("refer", phno)
                putExtra("email", email)
                putExtra("gender", gender)
                putExtra("middlename", middleName)
                putExtra("lastname", lastname)
                putExtra("addess", addres)
                putExtra("dept", dept)
            }
            startActivity(intent)
        }
    }
    private fun getData(nam:String, phn:String, emai:String,middleN:String,lastn:String,add:String){
        name= nam
        phno=phn
        email=emai
        middleName=middleN
        lastname=lastn
        addres=add
    }
}
