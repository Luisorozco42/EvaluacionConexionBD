package ni.edu.uca.sistematicopersistencia.domain.model

import androidx.room.ColumnInfo

data class ProductoInsert(
    val nombre: String,
    val precio: Double,
    val existencia: Int
)