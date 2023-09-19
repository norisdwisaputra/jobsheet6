 package com.example.noris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var inputpanjang: EditText
    private lateinit var inputlebar: EditText
    private lateinit var inputtinggi: EditText
    private lateinit var btn_result: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputpanjang = findViewById(R.id.edt_length)
        inputlebar = findViewById(R.id.edt_width)
        inputtinggi = findViewById(R.id.edt_height)
        result = findViewById(R.id.result)
        btn_result = findViewById(R.id.btn_result)

        btn_result.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_result){
            var panjang = inputpanjang.text.toString().trim()
            var lebar = inputlebar.text.toString().trim()
            var tinggi = inputtinggi.text.toString().trim()
            var volume = tinggi.toDouble() * panjang.toDouble() * lebar.toDouble()
            result.text = volume.toString()

        }
    }
}