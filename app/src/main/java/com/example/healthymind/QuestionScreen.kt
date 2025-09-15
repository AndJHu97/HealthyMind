package com.example.healthymind

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

data class Answer(val id: Int, val text: String)
data class Question(val id: Int, val text:String, val answers: List<Answer>)

//Makes it displayable and updateable when changed
@Composable
fun QuestionScreen(
    question: Question,
    onAnswerSelected: (Answer) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = question.text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        question.answers.forEach { answer ->
            Button(
                onClick = {onAnswerSelected(answer)},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(12.dp)
            ){
                Text(text = answer.text, fontSize = 18.sp)
            }
        }
    }
}