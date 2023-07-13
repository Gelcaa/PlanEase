package com.buanangelica.planease

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.text.font.fontFamily
import com.buanangelica.planease.ui.theme.PlanEaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }
    }
}
@Composable
fun Login(){
    val context = LocalContext.current
    var username by remember{ mutableStateOf(TextFieldValue(""))}
    var password by remember { mutableStateOf(TextFieldValue(""))}
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.to_do_list_logo),
            contentDescription ="Logo"
        )
        Text(
            text = "PlanEase",
            fontSize = 40.sp,
            style = TextStyle(letterSpacing = 8.sp)

        )
        TextField(
            value = username,
            onValueChange = {username = it},
            label = { Text(text = "Username",
                color = Color.White
            )},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(0xFF353E4D)),
            modifier = Modifier
                .padding(top = 30.dp, bottom = 30.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        TextField(value = password,
            onValueChange = {password = it},
            label = { Text(
                text = "Password" ,
                color = Color.White
            )},
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(0xFF353E4D)),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .padding(bottom = 30.dp)
                .clip(RoundedCornerShape(15.dp))

        )
        Button(
            onClick = {
                      if (username.text == "Gelca" && password.text == "gelca"){
                          Toast.makeText(context,"Welcome!", Toast.LENGTH_LONG)


                      }else {
                          Toast.makeText(context,"Incorrect Login information", Toast.LENGTH_LONG)
                      }

            },
            colors = ButtonDefaults.buttonColors(Color(0xFF353E4D)),
            modifier = Modifier
                .fillMaxWidth(.72f)
                .clip(RoundedCornerShape(15.dp))
        
        )
        
        {
            Text(text = "Login",
            color = Color.White)
            
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    Login()
}


