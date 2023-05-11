package ni.edu.uca.sistematicopersistencia.domain.usecase

import androidx.room.Insert
import ni.edu.uca.sistematicopersistencia.data.ProductoRepository
import ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto
import ni.edu.uca.sistematicopersistencia.data.database.entities.toInsertDatabase
import ni.edu.uca.sistematicopersistencia.domain.model.ProductoInsert
import javax.inject.Inject

class InsertProducto @Inject constructor(
    private val productoRepository: ProductoRepository
) {

    suspend fun insertProducto(productoInsert: ProductoInsert) {
        productoRepository.insertProducto(productoInsert.toInsertDatabase())
    }

}