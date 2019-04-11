package com.mk.test.parcelable0k

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.getParcelableExtra<Person>("AN_OBJECT")

        val label0: TextView = findViewById(R.id.label0)
        val label1: TextView = findViewById(R.id.label1)
        label0.text = person.name
        label1.text = person.age.toString()
    }
}
