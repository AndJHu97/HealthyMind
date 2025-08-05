import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    foreignKeys = [ForeignKey(
        entity = Question::class,
        parentColumns = ["id"],
        childColumns = ["questionId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("questionId")]
)
data class Answer(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val questionId: Int,  // FK to Question
    val answerText: String,
    val nextQuestionId: Int?,  // nullable: next question if any
    val solutionId: Int?       // nullable: solution if any
)