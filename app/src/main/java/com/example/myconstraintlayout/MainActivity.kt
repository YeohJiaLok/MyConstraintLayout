package com.example.myconstraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myconstraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
//        val boxOne = findViewById<TextView>(R.id.boxOneText)
//        val boxTwo = findViewById<TextView>(R.id.boxTwoText)
//        val boxThree = findViewById<TextView>(R.id.boxThreeText)
//        val boxFour = findViewById<TextView>(R.id.boxFourText)
//        val boxFive = findViewById<TextView>(R.id.boxFiveText)
//        val redButton = findViewById<Button>(R.id.red_button)
//        val greenButton = findViewById<Button>(R.id.green_button)
//        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val clickableViews: List<View> =
            listOf(binding.boxOne, binding.boxTwo, binding.boxThree,
                binding.boxFour,binding.boxFive,
                binding.redButton, binding.greenButton, binding.yellowButton
            )

        val clickables : List<View> =
            listOf(
                boxOne,boxTwo,boxThree,boxFour,boxFive
            )

        for (item in clickables){
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View){
        when(view.id){
            R.id.boxOneText -> view.setBackgroundColor(Color.BLUE)
            R.id.boxTwoText -> view.setBackgroundColor(Color.RED)
            R.id.boxThreeText -> view.setBackgroundColor(Color.YELLOW)
            R.id.boxFourText -> view.setBackgroundColor(Color.GREEN)
            R.id.boxFiveText -> view.setBackgroundColor(Color.MAGENTA)

            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
        }
    }
}