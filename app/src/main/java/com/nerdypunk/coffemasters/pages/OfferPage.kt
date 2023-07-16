package com.nerdypunk.coffemasters.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nerdypunk.coffemasters.R
import com.nerdypunk.coffemasters.ui.theme.Alternative2

//@Preview(showBackground = true, widthDp = 400)
//@Composable
//private fun Offer_Preview(){
//    Offer(title = "new title", description = "new description for offer card so that some new are to ")
//}

@Preview(showBackground = true)
@Composable
fun OfferPage() {
    Column(
         Modifier.verticalScroll(rememberScrollState())
    ) {

        Offer("Early Coffee",  "10% off. Offer valid from 6am to 9am.")
        Offer("Early Coffee",  "10% off. Offer valid from 6am to 9am.")
        Offer("Early Coffee",  "10% off. Offer valid from 6am to 9am.")
         Offer( "Welcome Gift", "25% off on your first order.")

    }

}

@Composable
fun Offer(title: String, description: String = "") {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.background_pattern),
            contentDescription = "Background Pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.matchParentSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative2)
                    .padding(16.dp)
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative2)
                    .padding(16.dp)
            )

        }
    }

}
