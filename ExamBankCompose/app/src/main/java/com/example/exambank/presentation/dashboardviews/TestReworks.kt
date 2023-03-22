package com.example.exambank.presentation.dashboardviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exambank.R
import com.example.exambank.ui.theme.paleBlack
import com.example.exambank.ui.theme.white


@Preview
@Composable
fun WelcomeBanner(
) {
    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Revise\nOn the Go",
                    modifier = Modifier
                        .padding(start = 10.dp, bottom = 20.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 36.sp,
                        fontFamily = FontFamily.Monospace
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.kcau_logo),
                    contentDescription = null,
                    modifier = Modifier.height(30.dp)
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clickable { },
            elevation = 10.dp,
            shape = RoundedCornerShape(10.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Box(
                    modifier = Modifier
                        .offset(140.dp, 0.dp)
                        .height(140.dp)
                        .clip(CircleShape)

                ) {
                    Image(
                        contentScale = ContentScale.Fit,
                        painter = painterResource(id = R.drawable.owner),
                        contentDescription = "",
                    )
                }
                Text(
                    text = "Exam Bank", color = paleBlack,
                    fontFamily = FontFamily.Monospace
                )
                Text(
                    text = "Right Resources", fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )
            }
        }
        Text(
            text = "*Explore\n *Learn\n   *Grow",
            fontWeight = FontWeight.W900,
            fontFamily = FontFamily.Monospace,
            fontSize = 35.sp,
            modifier = Modifier
                .padding(all = 24.dp)
        )
        // Call to Action

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .width(150.dp)
                    .clip(RoundedCornerShape(36.dp, 0.dp))
                    .background(color = Color.Red),
            )

            {
                Text(
                    text = "Access Revision Materials",
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .height(100.dp)
                    .width(150.dp)
                    .clip(RoundedCornerShape(0.dp, 36.dp))
                    .background(color = Color.DarkGray)
            )
            {
                Text(
                    text = "Propel your learning journey with ease",
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp))
                .background(Color.Green)
                .height(80.dp)
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .height(20.dp)
                    .width(80.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(color = Color.Blue)
            )
            {
                Text(
                    text = "Explore",
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
                Image(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Arrow",
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 80.dp)
                        .background(white),
                )
            }
        }
    }
}