package com.nerdypunk.coffemasters

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.nerdypunk.coffemasters.pages.InfoPage
import com.nerdypunk.coffemasters.pages.MenuPage
import com.nerdypunk.coffemasters.pages.OfferPage
import com.nerdypunk.coffemasters.pages.OrderPage

@OptIn(ExperimentalMaterial3Api::class)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun App(dataManager: DataManager) {
    var selectedRoute = remember{
        mutableStateOf(Routes.MenuPage.route)
    }
    Scaffold(
        topBar = {
                 TopAppBar(
                     title = { AppTitle()},
                 )
        },
        content = {
              when(selectedRoute.value){
                  Routes.MenuPage.route -> MenuPage(dataManager)
                  Routes.InfoPage.route -> InfoPage()
                  Routes.OrderPage.route -> OrderPage(dataManager)
                  Routes.OffersPage.route -> OfferPage()
              }
          },
        bottomBar = {
            NavBar(
                selectedRoute =selectedRoute.value,
                onChange = {
                selectedRoute.value = it
            })
        }
    )
}



@Composable
fun AppTitle() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Coffee masters")
    }
}