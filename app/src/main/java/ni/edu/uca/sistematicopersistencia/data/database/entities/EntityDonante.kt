package ni.edu.uca.sistematicopersistencia.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TblDonante") data class Donante(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("nombre")
    val nombre: String,
    @ColumnInfo("donacion")
    val donacion: Double,
    @ColumnInfo("numTarjeta")
    val tarjeta: String
)

