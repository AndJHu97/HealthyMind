import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface PreviousSolutionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(previousSolution: PreviousSolution)

    @Query("SELECT * FROM PreviousSolution")
    suspend fun getAll(): List<PreviousSolution>

    @Delete
    suspend fun delete(previousSolution: PreviousSolution)
}
