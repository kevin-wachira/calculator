package com.kevin.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //how do you do a memory optimization for your code
        //listener
        btncalculate.setOnClickListener {
            Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show() //it takes 3 parameters
            //collect the data
            var amount= txtamount.text.toString()
            var period= txtperiod.text.toString()
            var rate= txtrate.text.toString()
            if (amount.isBlank() or period.isBlank() or rate.isBlank())  // there are two method i blank(checks whether they is any white character in it.) and is empty()
            {
                Toast.makeText(this,"Fill In All Values",Toast.LENGTH_LONG).show() //it takes 3 parameters
            }
            else {
                //convert string into a number
                 var amt=amount.toDouble()
                var rat= rate.toDouble()
                var p = period.toDouble()
                var result = amt* rat/100* p
            //          display the result
               txtviewresult.text= "Interest is KES $result"
                Snackbar.make(txtamount,"KES $result.",Snackbar.LENGTH_LONG).show() // the first input it specify we talk about the view
            }
        }
        btncompound.setOnClickListener {
            //navigate
            val intent = Intent(this,CompoundActivity::class.java)
            startActivity(intent)
        }
    }
}
