package com.example.tiliga

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import com.example.tiliga.ui.theme.bgGrey
import com.example.tiliga.ui.theme.bgGreyDark


@Composable
fun profileScreen (modifier: Modifier = Modifier) {
 Column(
     modifier=modifier
         .fillMaxSize()
         .background(
             color = bgGrey
         ),

 ) {
@Composable
fun HeaderProfile() {
Box(
    modifier= Modifier
        .fillMaxWidth()
        .background(
            color = bgGreyDark
        )
        .height(175.dp)
)
 }
