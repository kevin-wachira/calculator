package com.kevin.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_compound.*


class CompoundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compound)
        btncalculate.setOnClickListener {
            var principle = txtprinciple.text.toString()
            var rate1 = txtrate1.text.toString()
            var compound = txtcompound.text.toString()
            var years = txtyears.text.toString()
            // var results=txtviewcalculate1.text.toString()

            if (principle.isBlank() or rate1.isBlank() or compound.isBlank() or years.isBlank()) {
                Toast.makeText(this, "Fill In All Values", Toast.LENGTH_LONG)
                    .show() //it takes 3 parameters

            } else {
                // now here we convert the strngs into double
                var comp = compound.toDouble()
                var prin = principle.toDouble()
                var r = rate1.toDouble()
                var y = years.toDouble()
                var results = Math.pow(prin * 1 + prin * r, y)
                txtviewcalculate1.text = "The compound Interest is $results"
                Snackbar.make(txtprinciple, "KES $results", Snackbar.LENGTH_LONG).show()
            }
        }

    }
}
