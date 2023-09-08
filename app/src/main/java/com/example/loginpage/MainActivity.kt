package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                LoginText()
                InputField()
                SubmitButton()
            }
        }
    }
}

@Composable
fun LoginText(){
        Text(text = "LOGIN PAGE", style = MaterialTheme.typography.headlineLarge)
    Spacer(modifier = Modifier.height(16.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputField(){
    var username by remember { mutableStateOf("") }
    TextField(value = username, onValueChange = { it -> username = it}, label = { Text("Username")}, modifier = Modifier.padding(16.dp))

    var password by remember { mutableStateOf("") }
    TextField(value = password, onValueChange = { password = it}, label = { Text("Password")}, modifier = Modifier.padding(16.dp))
}

@Composable
fun SubmitButton(){
    Button(modifier = Modifier.padding(16.dp), onClick = {}) {
        Text(text = "Submit")
    }

}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        LoginText()
        InputField()
        SubmitButton()
    }
}
