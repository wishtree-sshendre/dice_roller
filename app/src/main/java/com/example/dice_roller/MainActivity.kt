package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var dice_image : ImageView
    lateinit var rollbutton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dice_image = findViewById(R.id.image_dice)
        rollbutton = findViewById(R.id.roll_Button);

        rollbutton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        // val image_dice : ImageView = findViewById(R.id.image_dice)
        // val randomInt = Random().nextInt(6) + 1 // Instead of doing this we use inline variable
        val drawableResource   = when(Random().nextInt(6) + 1)//Inline variable
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        dice_image.setImageResource(drawableResource)

    }
}