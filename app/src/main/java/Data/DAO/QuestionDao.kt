import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface QuestionDao {
    @Query("SELECT * FROM Question WHERE id = :id")
    suspend fun getQuestionById(id: Int): Question?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(question: Question)

    @Query("SELECT * FROM Answer WHERE questionId = :questionId")
    suspend fun getAnswersForQuestion(questionId: Int): List<Answer>

    // similarly for conditionals
}
