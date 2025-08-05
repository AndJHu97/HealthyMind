import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface AnswerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(answer: Answer)

    @Query("SELECT * FROM Answer")
    suspend fun getAll(): List<Answer>

    @Delete
    suspend fun delete(answer: Answer)
}
