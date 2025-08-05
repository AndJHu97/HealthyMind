import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrentProblem(
    @PrimaryKey val problemId: Int,
    val lastUpdated: Long   // store as timestamp (epoch millis)
)
