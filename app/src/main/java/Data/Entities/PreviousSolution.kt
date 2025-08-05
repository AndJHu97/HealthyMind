import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PreviousSolution(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: Long,
    val answerText: String
)
