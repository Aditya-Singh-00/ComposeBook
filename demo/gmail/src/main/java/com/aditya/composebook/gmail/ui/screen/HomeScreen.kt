package com.aditya.composebook.gmail.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.aditya.composebook.gmail.model.Mail

@Composable
fun HomeScreen(
    mails: List<Mail> = emptyList()
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { },
        bottomBar = { },
        floatingActionButton = { },
        drawerContent = { }
    ) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .verticalScroll(scrollState)
        ) {
            mails.forEach {
                MailPreview(mail = it)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
private fun MailPreview(mail: Mail) {
    Box(
        modifier = Modifier
            .clickable { }
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = mail.from.profile),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .size(40.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Inside
        )
        Text(
            text = mail.time,
            modifier = Modifier.align(Alignment.TopEnd),
            color = MaterialTheme.colors.onBackground,
        )
        IconButton(
            onClick = { },
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Icon(
                imageVector = Icons.Default.StarBorder,
                contentDescription = null,
                modifier = Modifier.align(Alignment.BottomEnd),
                tint = MaterialTheme.colors.onBackground,
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 35.dp)
                .align(Alignment.TopCenter)
        ) {
            Text(
                text = mail.from.name,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.8f),
                maxLines = 1,
                style = MaterialTheme.typography.body1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = mail.subject,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.8f),
                maxLines = 1,
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = mail.body.message,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.8f),
                maxLines = 1,
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
