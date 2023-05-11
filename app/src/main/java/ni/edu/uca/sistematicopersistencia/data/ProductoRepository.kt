package ni.edu.uca.sistematicopersistencia.data

import ni.edu.uca.sistematicopersistencia.data.database.dao.ProductoDao
import ni.edu.uca.sistematicopersistencia.data.database.entities.EntityProducto
import javax.inject.Inject

class ProductoRepository @Inject constructor(
    private val productoDao: ProductoDao
) {

    suspend fun insertProducto(entityProducto: EntityProducto) {
        productoDao.insertarReg(entityProducto)
    }

}