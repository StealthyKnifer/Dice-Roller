package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var images:ArrayList<Int> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        images.add(R.drawable.dice_1)
        images.add(R.drawable.dice_2)
        images.add(R.drawable.dice_3)
        images.add(R.drawable.dice_4)
        images.add(R.drawable.dice_5)
        images.add(R.drawable.dice_6)

        rollBtn.setOnClickListener {
            var number = (0..5).random()
            rollIV.setImageResource(images[number])
        }
    }
}