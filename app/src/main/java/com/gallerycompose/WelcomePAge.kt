package com.gallerycompose

import androidx.collection.intIntMapOf
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun TopLayout() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .fillMaxSize()
    ) {
        Text(
            text = "Welcome",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            textDecoration = TextDecoration.LineThrough,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.White,
        )
        Image(
            painter = painterResource(id = R.drawable.icon_houseboat),
            contentDescription = "Dummy icon",
            modifier = Modifier
                .size(100.dp)
                .border(
                    BorderStroke(5.dp, Color.Green), shape = CircleShape
                ),
            colorFilter = ColorFilter.tint(Color.White),
            contentScale = ContentScale.FillHeight,
            alignment = Alignment.Center
        )

        Card(
            border = BorderStroke(2.dp, Color.Blue),
            modifier = Modifier.size(100.dp, 100.dp),
            // colors = CardDefaults.cardColors(contentColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Text(
                text = "Changes into the",
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }

        ModalBottomSheet(onDismissRequest = {
            Modifier =o
        }) {
            Text(text = "Bottom sheet0")
        }

    }

}


@Composable
fun CardsWithBox() {
    Box {

        Card(
            border = BorderStroke(2.dp, Color.Blue),
            modifier = Modifier
                .size(200.dp, 200.dp)
                .align(Alignment.TopStart)
        ) {}
        Card(
            border = BorderStroke(2.dp, Color.Red),
            modifier = Modifier
                .size(50.dp, 50.dp)
                .align(Alignment.BottomEnd),
        ) {}
        Card(
            border = BorderStroke(2.dp, Color.Red),
            modifier = Modifier
                .size(50.dp, 50.dp)
                .align(Alignment.TopStart),
        ) {}
    }
}