package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        HeaderSection(
            fullName = "Android Developer",
            title = "Jetpack Compose Specialist"
        )
        ContactSection(
            phoneNumber = "+1 (555) 019-2834",
            socialHandle = "@AndroidDev",
            email = "developer@android.com"
        )
    }
}

@Composable
fun HeaderSection(fullName: String, title: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = fullName,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF103615)
        )
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF006D3A),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun ContactSection(phoneNumber: String, socialHandle: String, email: String) {
    Column(
        modifier = Modifier
            .padding(bottom = 50.dp)
            .fillMaxWidth(0.8f),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        ContactRow(infoText = phoneNumber)
        ContactRow(infoText = socialHandle)
        ContactRow(infoText = email)
    }
}

@Composable
fun ContactRow(infoText: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = infoText,
            fontSize = 14.sp,
            color = Color(0xFF103615)
        )
    }
}
