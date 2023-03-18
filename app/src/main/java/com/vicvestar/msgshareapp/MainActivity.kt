package com.vicvestar.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnShowToast)

      button.setOnClickListener{
          //code to execute when the button is clicked
          Log.i("MainActivity", "Button was clicked!")
          Toast.makeText(this,"Button was clicked",Toast.LENGTH_LONG).show()
      }
       val button2 = findViewById<Button>(R.id.btnSendMsgToNextActivity)
        button2.setOnClickListener {


            val etUserMessage = findViewById<TextView>(R.id.etUserMessage)
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}