package com.example.foodapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.foodapplication.ui.theme.FoodApplicationTheme

class Login : ComponentActivity() {
    private lateinit var Username: EditText
    private lateinit var Password: EditText
    private lateinit var LogButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        Username = findViewById(R.id.username)
        Password = findViewById(R.id.password)
        LogButton = findViewById(R.id.button)

        LogButton.setOnClickListener{
            val username = Username.text.toString()
            val password = Password.text.toString()

            if(isValid(username, password)){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValid(username: String, password: String):Boolean{
        return username.isNotBlank() && password.isNotBlank()
    }
}