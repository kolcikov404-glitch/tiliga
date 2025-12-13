package com.example.tiliga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.tiliga.databinding.ActivityMainBinding
import com.example.tiliga.ui.theme.TiligaTheme
import com.google.android.material.snackbar.Snackbar
import com.example.tiliga.ui.theme.bgGrey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TiligaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(){ Bashka()

                    }
                    Box(modifier = Modifier.padding(innerPadding))
                }
                setContent {
                    Column {
                        Text("Денис Шпигальский", fontSize = 28.sp)
                    }
                }
            }
        }
    }
}
@Composable
fun Bashka(modifier: Modifier= Modifier, navController: NavHostController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = bgGrey
            ),
    ) {
        Bashka(navController)

        InfoProfile()

        MenuApplication()
    }

}
@Composable
fun BashkaProfile(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color= bgGreyDark
            )
            .height(175.dp)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
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
                            interactionSource = remember { MutableInteractionSource() }
                        ),

                    )
                Spacer(
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "Денис Шпигальский",
                    color = txtMainWhite,
                    fontSize = 20.sp
                )
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        ContentDescription= "",
        modifier = Modifier
            .padding(10.dp)
            .size(30.dp)
            .clickable(
                onClick = {Firebase.auth.signOut()
                  navController.navigate(route = "login")},
                indication = ripple(),
                interactionSource = remember { MutableInteractionSource()}
            )
            ,

    )

}
