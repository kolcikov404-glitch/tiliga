package com.example.tiliga

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiliga.R
import com.example.tiliga.ui.theme.bgGrey
import com.example.tiliga.ui.theme.bgGreyDark
import com.example.tiliga.ui.theme.brGreyDarkBorder
import com.example.tiliga.ui.theme.txtMainSelected
import com.example.tiliga.ui.theme.txtMainWhite

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
) {
    Box(
        modifier= Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier= Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center
            horizontalAlignment=Alignment.CenterHorizontally
        ) {
           Image(
               painter = painterResource(R.drawable.user),
               contentDescription = "",
               contentScale = ContentScale.Crop,
               modifier = Modifier
                   .size(100.dp)
                   .shadow(3.dp, CircleShape)
                   .clip(CircleShape)
                   .clickable(
                       onClick = {},
                       indication = ripple(),
                       interactionSource = remember{MutableInteractionSource()}
                   ),

           )
            Spacer(
                modifier=modifier.size(15.dp)
            )
            Text( "Шпигальский Денис",
                color =txtMainWhite,
                fontSize = 20.sp
            )
        }
    }

    Box(
        modifier= Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            painter = painterResource(R.drawable.asd_1),
            contentDescription = "",
            modifier = Modifier
                .padding(10.dp)
                .size(30.dp)
                .clickable(
                    onClick = {}
                    indication =ripple(),
                    interactionSource = remember {mutableInteractionSource()}
                )
        )
    }