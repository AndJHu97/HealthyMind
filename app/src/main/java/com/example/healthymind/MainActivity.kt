package com.example.healthymind

import AppDatabase
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.healthymind.ui.theme.HealthyMindTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        db = DatabaseProvider.getDatabase(this)
        setContent {
            HealthyMindTheme {
                androidx.compose.runtime.rememberCoroutineScope().launch {
                    val firstQuestion = db.questionDao().getQuestionById(1)
                    if(firstQuestion != null){
                        val question = Question(
                            id = firstQuestion.id,
                            text = firstQuestion.questionText,
                            answers = listOf(
                                Answer(1, "Red"),
                                Answer(2, "Blue"),
                                Answer(3, "Green")
                            )
                        )
                        QuestionScreen(question) {selected -> println("Selected: ${selected.text}") }

                    }


                }
            }
        }
    }
}
