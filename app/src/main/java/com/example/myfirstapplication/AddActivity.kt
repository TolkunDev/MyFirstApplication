package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.Constants.Companion.counter
import com.example.myfirstapplication.Constants.Companion.notes

class AddActivity : AppCompatActivity() {
    lateinit var back:ImageButton
    lateinit var nameET:EditText
    lateinit var descriptionET:EditText
    lateinit var addBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        back = findViewById(R.id.backBtn)
        nameET = findViewById(R.id.name)
        descriptionET = findViewById(R.id.description)
        val flag = false
        addBtn = findViewById(R.id.addDone)
        addBtn.setOnClickListener {
            notes.add(
                Wish(
                    counter,
                    nameET.text.toString(),
                    descriptionET.text.toString(),
                    flag
                )
            )
            counter++
            Log.d("DDDD","Added wish: ${notes}")
        }
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}