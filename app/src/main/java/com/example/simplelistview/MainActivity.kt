package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1- Define the list or Adapter View
        val listView:ListView = findViewById(R.id.listView1)

        //2- Define the datasource
        var world_cup_countries = arrayOf(
            "Germany","Spain","England","Brazil","French","Portugal"
        )

        //3- Define the adapter which acts like a bridge between datasource and listview
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1
            ,world_cup_countries
        )
        //4- Set the adapter for the list
        listView.adapter = arrayAdapter
    }
}