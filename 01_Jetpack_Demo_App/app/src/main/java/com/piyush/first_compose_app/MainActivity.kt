package com.piyush.first_compose_app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.piyush.first_compose_app.ui.theme.First_Compose_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp), // Set padding for the Column
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hello World",
                    modifier = Modifier.padding(bottom = 8.dp), // Set padding between texts
                    style = TextStyle(
                        fontSize = 24.sp, // Set text size
                        fontWeight = FontWeight.Bold // Set text style
                    )
                )
                Text(
                    text = "",
                    modifier = Modifier.padding(bottom = 8.dp) // Set padding between texts
                )
                Text(
                    text = "Hello World",
                    modifier = Modifier.padding(bottom = 8.dp), // Set padding between texts
                    style = TextStyle(
                        fontSize = 24.sp, // Set text size
                        fontWeight = FontWeight.Bold // Set text style
                    )
                )
                Text(
                    text = "",
                    modifier = Modifier.padding(bottom = 8.dp) // Set padding between texts
                )
                Button(onClick = {
                    Toast.makeText(applicationContext, "Button is Working Completely Fine.", Toast.LENGTH_LONG).show()
                }) {
                    Text(text = "Click Me")
                }
            }
        }
    }
}
