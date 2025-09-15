import Data.Entities.RequirementType
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity
//Like the arrow from answer to next question
data class Conditional(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    // The trigger: which entity type and which ID
    val triggerId: Int,
    val triggerType: RequirementType, // ANSWER, QUESTION, SOLUTION

    // Next step: go to either a question or solution. Null means no more
    val nextStepId: Int? = null,
    val nextStepType: RequirementType? = null
)
