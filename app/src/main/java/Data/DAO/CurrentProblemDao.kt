import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface CurrentProblemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(currentProblem: CurrentProblem)

    @Query("SELECT * FROM CurrentProblem")
    suspend fun getAll(): List<CurrentProblem>

    @Delete
    suspend fun delete(currentProblem: CurrentProblem)
}
