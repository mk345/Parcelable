package com.mk.test.parcelable0k

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("John", 18)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener() { v ->
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("AN_OBJECT", person)

            startActivity(intent)
        }
    }
}
