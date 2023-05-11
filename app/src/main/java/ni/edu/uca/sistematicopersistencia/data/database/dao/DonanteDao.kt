package ni.edu.uca.sistematicopersistencia.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ni.edu.uca.sistematicopersistencia.data.database.entities.Donante

@Dao
interface DonanteDao {

    @Query("SELECT * FROM TblDonante ORDER BY nombre DESC")
    fun obtRegistro(): Flow<List<Donante>>

    @Query("SELECT * FROM TblDonante WHERE id= :id")
    fun obtRegistro(id:Int): Donante

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertarRegistro(donante: Donante)

    @Update
    suspend fun actualizarRegistro(donante: Donante)

    @Delete
    suspend fun eliminarRegistro(donante: Donante)
}