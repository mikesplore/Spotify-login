package com.mike.spotifylogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(){
    var username by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}

    Column (modifier = Modifier
    .background(Color(0xFF121212))
    .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceAround){
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(250.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(painter = painterResource(id = R.drawable.spotify), contentDescription = null,modifier = Modifier.size(120.dp))
    Text(text = "Spotify", style= TextStyle() ,
        fontSize =  40.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,


    )


    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
        OutlinedTextField(value = username, onValueChange = {username = it}, label = {Text("Username",
            style = TextStyle(color = Color(0xff7d7d7a))
        )},
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color(0xFF4f4f4e),
                unfocusedTextColor = Color(0xff4f4f4e),
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Gray
            ),
            shape = RoundedCornerShape(30.dp)
            )
        OutlinedTextField(value = password, onValueChange = {password = it}, label = {Text("Username",
            style = TextStyle(color = Color(0xff7d7d7a))
        )},
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color(0xff4f4f4e),
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color.Gray,

            ),
            shape = RoundedCornerShape(30.dp)
        )
        Row(modifier = Modifier
            .height(25.dp)
            .width(280.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End) {
            Text(text = "Forgot Password?",
                style = TextStyle(),
                fontWeight = FontWeight.Light,
                fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                fontSize = 15.sp,
                color = Color.White
           )

        }



    }

    val spotifyGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF1D8348), // Dark green color code
            Color(0xFF1DB954) // Green color code
        )
    )

    Box(modifier = Modifier
        .width(270.dp)
        .height(40.dp)
        .background(brush = spotifyGradient, shape = RoundedCornerShape(30.dp))){
        Button(onClick = { /*TODO*/ },
            modifier= Modifier.width(270.dp),
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text = "Sign Up",
                style = TextStyle(),
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp,
                color = Color.Black
           )
            
        }

}
    Column(modifier = Modifier
        .height(100.dp)
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Be Correct With",
            style = TextStyle(),
            fontSize = 15.sp,
            color = Color(0xFF1DB954),
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold
        )

        Row (modifier = Modifier.size(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = null,modifier = Modifier.size(18.dp))
            Image(painter = painterResource(id = R.drawable.google), contentDescription = null,modifier = Modifier.size(18.dp))

        }


    }

    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {
        Text(
            text = "Don't have an account? ",
            style = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color(0xff7d7d7a)
            )
        )
        Text(
            text = "Sign Up",
            modifier = Modifier.clickable(onClick = { /*TODO*/ }),
            style = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color(0xFF1DB954) // Adjust the color to match your design
            )
        )
    }



}
}

@Preview
@Composable
fun Loginpreview(){
    Login()
}