package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    // Long way of doing things.
    // Creating variables for widgets -->
    // ID of the widget: TYPE of widget -> after -> IMPORT widgets
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_counter)

        // Finding ID's and creating local variables
        val userInput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)
        textView?.text = ""
        textView = findViewById(R.id.textView)

        // Adds scrolling to the textView, because of vertical scroll indicator
        textView?.movementMethod = ScrollingMovementMethod()

        userInput.setText("")
        // Button onClick
        button.setOnClickListener {
            Log.d(TAG, "onClick: called")
            textView?.append(userInput.text)
            textView?.append("\n")
            // Clear content of input
//            userInput.text.clear()
            userInput.setText("")
        }
    }
}