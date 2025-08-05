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
data class Conditional(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val questionId: Int,  // FK to Question
    val dependentSolutionId: Int,  // Solution id to check if empty or filled
    val mustBeFilled: Boolean       // true if solution id must be filled
)
