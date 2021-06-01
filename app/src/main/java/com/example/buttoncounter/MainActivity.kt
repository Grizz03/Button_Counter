package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import kotlin.reflect.KMutableProperty0

class MainActivity : AppCompatActivity() {
    // Long way of doing things.
    // Creating variables for widgets -->
    // ID of the widget: TYPE of widget -> after -> IMPORT widgets
    private var userInput: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_counter)

        // Finding ID's
        userInput = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView?.text = ""
        textView = findViewById(R.id.textView)

        // Adds scrolling to the textView, because of vertical scroll indicator
        textView?.movementMethod = ScrollingMovementMethod()

        // Button onClick
        button?.setOnClickListener {
            textView?.append(userInput?.text)
            textView?.append("\n")
        }
    }
}