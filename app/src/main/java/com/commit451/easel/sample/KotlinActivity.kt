package com.commit451.easel.sample

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.commit451.easel.kotlin.tint
import com.commit451.easel.kotlin.tintCursor

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        var editText = findViewById(R.id.editText) as EditText
        editText.tintCursor(Color.RED)

        var button = findViewById(R.id.button_custom) as Button
        button.tint(Color.RED)
    }
}
