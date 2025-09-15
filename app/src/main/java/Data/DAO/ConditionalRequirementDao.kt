import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Delete

@Dao
interface ConditionalRequirementDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(conditionalRequirement: ConditionalRequirement)

    @Query("SELECT * FROM ConditionalRequirement")
    suspend fun getAll(): List<ConditionalRequirement>

    @Delete
    suspend fun delete(conditionalRequirement: ConditionalRequirement)
}
