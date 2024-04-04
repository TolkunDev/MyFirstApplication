package com.example.myfirstapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditActivity : AppCompatActivity() {
    lateinit var nameText:EditText
    lateinit var descriptionText:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
       nameText = findViewById(R.id.nameUp)
       descriptionText = findViewById(R.id.descriptionUp)
        val itemName = intent.getStringExtra("itemName")
        val description = intent.getStringExtra("itemDescription")
        nameText.setText( itemName.toString())
        nameText.setText(description.toString())
    }
}