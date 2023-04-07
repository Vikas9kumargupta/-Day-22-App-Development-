package com.example.lecture22adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()

        taskList.add("Worship Lord Hanuman Ji")
        taskList.add("Attend Class")
        taskList.add("Complete App Development Project")
        taskList.add("Walk Daily 6000 steps and 5 km")
        taskList.add("Work on Resume")
        taskList.add("Improve internet presence")
        taskList.add("Improve Communication Skills")
        taskList.add("Practice daily to Code")
        taskList.add("Keep Yourself away from Bad People")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener{parent, view, position, id ->
            val text = "Clicked on item" + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
    }
}