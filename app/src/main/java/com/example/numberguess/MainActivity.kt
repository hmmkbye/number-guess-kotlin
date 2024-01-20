package com.example.numberguess

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val winImg: ImageView = findViewById(R.id.win_img)


        winImg.setVisibility(View.GONE);
        rollButton.setOnClickListener {

            val randomInt = Random().nextInt(6) + 1


            if(randomInt == 4) {
                winImg.setVisibility(View.VISIBLE);
            } else {
                winImg.setVisibility(View.GONE);
            }



        }
    }
}