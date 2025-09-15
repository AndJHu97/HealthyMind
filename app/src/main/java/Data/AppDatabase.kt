import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        Question::class,
        Answer::class,
        Conditional::class,
        ConditionalRequirement::class,
        Solution::class,
        Problem::class,
        CurrentProblem::class,
        PreviousSolution::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
    abstract fun answerDao(): AnswerDao
    abstract fun conditionalDao(): ConditionalDao
    abstract fun solutionDao(): SolutionDao
    abstract fun problemDao(): ProblemDao
    abstract fun currentProblemDao(): CurrentProblemDao
    abstract fun previousSolutionDao(): PreviousSolutionDao
    abstract fun conditionalRequirementDao(): ConditionalRequirementDao
}
