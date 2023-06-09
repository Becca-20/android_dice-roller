package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


/**
 * This activity allows the user to roll a dice and view the result on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

            // The below code shows a message when the button is clicked
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()

//            // lines 15 + 16 can be simplified to the below:
//            // Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

            // Static textView when dice is rolled
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"

            rollDice()
        }
    }

    private fun rollDice() {
        // create a new dice object with 6 sides + roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

/**
 * This class contains the dice roll logic.
 */
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}