import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Answer(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val answerText: String
)