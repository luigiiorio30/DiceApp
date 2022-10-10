package com.example.diceapp.data

import android.media.FaceDetector
import com.example.diceapp.R
import com.example.diceapp.model.Dice

object Datasource {
    val loadDice = listOf<Dice>(
        Dice(
            FaceDice = R.drawable.dice_1,
            Description = R.string.dice1
        ),
        Dice(
            FaceDice =R.drawable.dice_2,
            Description = R.string.dice2
        ),
        Dice(
            FaceDice =R.drawable.dice_3,
            Description = R.string.dice3
        ),
        Dice(
            FaceDice =R.drawable.dice_4,
            Description = R.string.dice4
        ),
        Dice(
            FaceDice =R.drawable.dice_5,
            Description = R.string.dice5
        ),
        Dice(
            FaceDice =R.drawable.dice_6,
            Description = R.string.dice6
        ),
    )
}