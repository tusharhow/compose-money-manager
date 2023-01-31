package com.example.composemoneymanager.views.home_page

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import  com.example.composemoneymanager.R
import com.example.composemoneymanager.ui.theme.kGreenColor
import com.example.composemoneymanager.ui.theme.kOrangeColor

@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        content = {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                content = {

                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = null,
                        modifier = Modifier
                            .width(140.dp)
                            .height(140.dp)
                    )
                    Spacer(modifier = Modifier.height(26.dp))
                    Card(
                        modifier = Modifier
                            .width(350.dp)
                            .height(360.dp),
                        backgroundColor = Color.White,
                        elevation = 10.dp,
                        shape = RoundedCornerShape(40.dp),
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                content = {
                                    Text(
                                        text = "Total Balance", style = TextStyle(
                                            fontSize = 15.sp,
                                        )
                                    )
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Text(
                                            text = "\$1,000.", style = TextStyle(
                                                fontSize = 30.sp,
                                                color = Color.Black, fontWeight = FontWeight.Bold
                                            )
                                        )
                                        Text(
                                            text = "00", style = TextStyle(
                                                fontSize = 30.sp,
                                                color = Color.Gray, fontWeight = FontWeight.Bold
                                            )
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(10.dp))
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Text(
                                            text = "Master Card", style = TextStyle(
                                                fontSize = 15.sp,
                                                color = Color.Black,
                                                fontWeight = FontWeight.Bold
                                            )
                                        )
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Image(
                                            painter = painterResource(id = R.drawable.down_arrow),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(15.dp)
                                                .height(15.dp)
                                        )


                                    }
                                    Spacer(modifier = Modifier.height(10.dp))
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Text(
                                            text = "\$64,245.", style = TextStyle(
                                                fontSize = 40.sp,
                                                color = Color.Black,
                                                fontWeight = FontWeight.Bold
                                            )
                                        )
                                        Text(
                                            text = "00", style = TextStyle(
                                                fontSize = 40.sp,
                                                color = Color.Gray, fontWeight = FontWeight.Bold
                                            )
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(20.dp))
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .width(150.dp)
                                                .height(50.dp)
                                                .shadow(10.dp, RoundedCornerShape(10.dp)),
                                            content = {
                                                Card(
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .fillMaxHeight(),
                                                    backgroundColor = kOrangeColor,
                                                    elevation = 0.dp,
                                                    shape = RoundedCornerShape(30.dp),
                                                    border = BorderStroke(1.dp, Color.Gray),
                                                    content = {
                                                        Row(
                                                            modifier = Modifier
                                                                .fillMaxWidth()
                                                                .fillMaxHeight(),
                                                            horizontalArrangement = Arrangement.Center,
                                                            verticalAlignment = Alignment.CenterVertically,
                                                            content = {
                                                                Text(
                                                                    text = "Card Info",
                                                                    style = TextStyle(
                                                                        fontSize = 15.sp,
                                                                        color = Color.Black,
                                                                        fontWeight = FontWeight.Bold
                                                                    )
                                                                )
                                                            }
                                                        )
                                                    }
                                                )
                                            }
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))

                                        Box(
                                            modifier = Modifier
                                                .width(150.dp)
                                                .height(50.dp)
                                                .shadow(10.dp, RoundedCornerShape(10.dp)),
                                            content = {
                                                Card(
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .fillMaxHeight(),
                                                    backgroundColor = kOrangeColor,
                                                    elevation = 0.dp,
                                                    shape = RoundedCornerShape(30.dp),
                                                    border = BorderStroke(1.dp, Color.Gray),
                                                    content = {
                                                        Row(
                                                            modifier = Modifier
                                                                .fillMaxWidth()
                                                                .fillMaxHeight(),
                                                            horizontalArrangement = Arrangement.Center,
                                                            verticalAlignment = Alignment.CenterVertically,
                                                            content = {
                                                                Text(
                                                                    text = "Add Cash",
                                                                    style = TextStyle(
                                                                        fontSize = 15.sp,
                                                                        color = Color.Black,
                                                                        fontWeight = FontWeight.Bold
                                                                    )
                                                                )
                                                            }
                                                        )
                                                    }
                                                )
                                            }
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(20.dp))
                                    Box(
                                        modifier = Modifier
                                            .width(310.dp)
                                            .height(70.dp)
                                            .shadow(10.dp, RoundedCornerShape(10.dp)),
                                        content = {
                                            Card(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .fillMaxHeight(),
                                                backgroundColor = kGreenColor,
                                                elevation = 0.dp,
                                                shape = RoundedCornerShape(30.dp),
                                                border = BorderStroke(1.dp, Color.Black),
                                                content = {
                                                    Row(
                                                        modifier = Modifier
                                                            .fillMaxWidth()
                                                            .fillMaxHeight(),
                                                        horizontalArrangement = Arrangement.Center,
                                                        verticalAlignment = Alignment.CenterVertically,
                                                        content = {
                                                            Text(
                                                                text = "Send or Pay",
                                                                style = TextStyle(
                                                                    fontSize = 18.sp,
                                                                    color = Color.Black,
                                                                    fontWeight = FontWeight.Bold
                                                                )
                                                            )
                                                        }
                                                    )
                                                }
                                            )
                                        }
                                    )


                                }
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Received", style = TextStyle(
                                fontSize = 30.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Text(
                            text = "+\$89,235", style = TextStyle(
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Divider(

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Savings", style = TextStyle(
                                fontSize = 30.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Text(
                            text = "+\$15,369", style = TextStyle(
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Divider(

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Invest", style = TextStyle(
                                fontSize = 30.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Text(
                            text = "+\$85,120", style = TextStyle(
                                fontSize = 22.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Recent spending's", style = TextStyle(
                                fontSize = 15.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Image(
                            painter = painterResource(id = R.drawable.down_arrow),
                            contentDescription = null,
                            modifier = Modifier
                                .width(15.dp)
                                .height(15.dp)
                        )


                    }
                }
            )
        }
    )

}