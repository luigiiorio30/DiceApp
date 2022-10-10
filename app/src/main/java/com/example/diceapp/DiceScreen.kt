package com.example.diceapp
import android.icu.text.CaseMap.Title
import android.provider.ContactsContract.Data
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceapp.data.Datasource
import kotlinx.coroutines.launch
import kotlin.math.round

@Composable
fun DiceApp() {
    Scaffold (

        topBar = { TopBar() },
        bottomBar = {  }

    ){
        DiceSort()
    }
}

@Composable
fun TopBar() {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.primary,
    ){

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.h1,
                fontSize = 30.sp,
                modifier = Modifier.width(450.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}