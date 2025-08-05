import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface ProblemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(problem: Problem)

    @Query("SELECT * FROM Problem")
    suspend fun getAll(): List<Problem>

    @Delete
    suspend fun delete(problem: Problem)
}
