package com.pablo.smiesznasprawa

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bLeft = findViewById<Button>(R.id.goLeft)
        val bRight = findViewById<Button>(R.id.goRight)
        val res = findViewById<Button>(R.id.submitResult)
        val images = arrayOf(R.drawable.i1, R.drawable.i2, R.drawable.i3)
        val image = findViewById<ImageView>(R.id.imageView)
        bLeft.setOnClickListener() {
            if (image.drawable.constantState == resources.getDrawable(images[0]).constantState) {
                image.setImageResource(images[2])
            } else if (image.drawable.constantState == resources.getDrawable(images[1]).constantState) {
                image.setImageResource(images[0])
            } else if (image.drawable.constantState == resources.getDrawable(images[2]).constantState) {
                image.setImageResource(images[1])
            }
        }
        bRight.setOnClickListener() {
            if (image.drawable.constantState == resources.getDrawable(images[0]).constantState) {
                image.setImageResource(images[1])
            } else if (image.drawable.constantState == resources.getDrawable(images[1]).constantState) {
                image.setImageResource(images[2])
            } else if (image.drawable.constantState == resources.getDrawable(images[2]).constantState) {
                image.setImageResource(images[0])
            }
        }
        res.setOnClickListener() {
            val text = findViewById<EditText>(R.id.silnia)
            val number = text.text.toString().toInt()
            val result = number*1*2*3
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Result")
            builder.setMessage("Silnia z $number to $result")
            builder.setPositiveButton("OK", null)
            builder.show()
        }

    }
}