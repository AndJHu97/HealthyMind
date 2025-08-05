import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    foreignKeys = [ForeignKey(
        entity = Problem::class,
        parentColumns = ["id"],
        childColumns = ["problemId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("problemId")]
)
data class Solution(
    @PrimaryKey val id: Int,
    val solutionType: String,    // e.g. "prompt" or "saved_text"
    val promptText: String,
    val answers: String?,        // JSON string or comma-separated answers (for prompts)
    val problemId: Int,
    val previousAnswerIds: String?,  // comma-separated IDs to PreviousSolutions
    val nextSolutionId: Int?
)
