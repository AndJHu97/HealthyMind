import Data.Entities.RequirementType
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    foreignKeys = [ForeignKey(
        entity = Conditional::class,
        parentColumns = ["id"],
        childColumns = ["conditionalId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class ConditionalRequirement(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val conditionalId: Int,              // FK to Conditional
    val type: RequirementType,           // ANSWER / QUESTION / SOLUTION
    val targetId: Int,                   // ID of Answer, Question, or Solution
    val mustBePresent: Boolean           // true = must exist, false = must NOT exist
)
