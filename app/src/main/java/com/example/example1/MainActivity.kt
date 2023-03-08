package com.example.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinnerChoice:Spinner=findViewById(R.id.spinner)
        var list_of_items= arrayOf("coffee","tea","milo")

        //create an ArrayAdapter using a simple spinner layout.
        val aa=ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
        //set input to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //set Adapter to spinner
        spinnerChoice!!.setAdapter(aa)
    }
}