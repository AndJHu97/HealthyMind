import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface ConditionalDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(conditional: Conditional)

    @Query("SELECT * FROM Conditional")
    suspend fun getAll(): List<Conditional>

    @Delete
    suspend fun delete(conditional: Conditional)
}