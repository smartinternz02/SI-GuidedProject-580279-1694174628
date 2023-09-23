package com.example.foodapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.foodapplication.ui.theme.FoodApplicationTheme

class Restaurant : ComponentActivity() {

    private lateinit var rest1: Button
    private lateinit var rest2: Button
    private lateinit var rest3: Button
    private lateinit var rest4: Button
    private lateinit var rest5: Button
    private lateinit var rest6: Button
    private lateinit var rest7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_restaurant)
        rest1 = findViewById(R.id.button1)
        rest2 = findViewById(R.id.button2)
        rest3 = findViewById(R.id.button3)
        rest4 = findViewById(R.id.button4)
        rest5 = findViewById(R.id.button5)
        rest6 = findViewById(R.id.button6)
        rest7 = findViewById(R.id.button7)

    }
}