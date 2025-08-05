import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface SolutionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(solution: Solution)

    @Query("SELECT * FROM Solution")
    suspend fun getAll(): List<Solution>

    @Delete
    suspend fun delete(solution: Solution)
}

