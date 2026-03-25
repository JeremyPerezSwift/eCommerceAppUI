package com.jeremyperez.ecommerceappui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jeremyperez.ecommerceappui.R
import com.jeremyperez.ecommerceappui.ui.theme.backgroundGrey
import com.jeremyperez.ecommerceappui.ui.theme.bellOrange
import com.jeremyperez.ecommerceappui.ui.theme.textGreen
import com.jeremyperez.ecommerceappui.ui.theme.textOrange

@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        Modifier, bottomBar = {
            BottomBar()
        }
    ) { paddingValues ->
        Column(
            Modifier.fillMaxSize().background(Color.White)
                .padding(vertical = 30.dp)
        ) {
            Row(
                Modifier.fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(SpanStyle(color = textOrange)) {
                            append("Hyper")
                        }
                        withStyle(SpanStyle(color = textGreen)) {
                            append("Mart")
                        }
                    },
                    Modifier,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.weight(1f))

                Row(
                    Modifier,
                    horizontalArrangement = Arrangement.spacedBy(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Eng")

                    Box(
                        Modifier.clip(CircleShape)
                            .background(backgroundGrey)
                            .padding(5.dp)
                    ) {
                        Icon(Icons.Filled.Notifications, null, Modifier, tint = bellOrange)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BottomBar() {
    val bottomBarIcons = listOf(
        R.drawable.home_icon,
        R.drawable.categories_icon,
        R.drawable.wishlist_icon,
        R.drawable.profile_icon,
    )

    Box(
        Modifier.fillMaxWidth().wrapContentHeight(),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Row(
            Modifier.fillMaxWidth()
                .background(Color.White)
                .padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(60.dp)
        ) {
            bottomBarIcons.forEachIndexed { index, icon ->
                Image(painter = painterResource(icon), null, Modifier.size(24.dp))
                if(index == 1)
                    Spacer(Modifier.width(20.dp))
            }
        }

        Image(painter = painterResource(R.drawable.center_tab), null)
    }
}