package com.buanangelica.planease

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Greeting(){
    Column(Modifier.fillMaxWidth()
        .padding(70.dp),
    horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Welcome",
            fontSize = 40.sp,
            style = TextStyle(letterSpacing = 8.sp)
        )
        Text(text = "Gelca",
            fontSize = 36.sp,
            style = TextStyle(letterSpacing = 8.sp))
    }
}

@Composable
fun ToDoLists(){
Card(Modifier.fillMaxWidth()
    .padding(15.dp)
    .height(100.dp)
) {
    Text(text = "Add new List",
        modifier = Modifier.padding(10.dp))

}
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    Column() {
        Greeting()
        ToDoLists()
    }

}