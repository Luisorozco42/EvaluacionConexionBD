package ni.edu.uca.sistematicopersistencia.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ni.edu.uca.sistematicopersistencia.domain.model.ProductoInsert
import ni.edu.uca.sistematicopersistencia.domain.usecase.InsertProducto
import javax.inject.Inject

@HiltViewModel
class ViewModelProducto @Inject constructor(
    private val insertProducto: InsertProducto
): ViewModel() {
    fun insertProducto(productoInsert: ProductoInsert){
        viewModelScope.launch{
            insertProducto.insertProducto(productoInsert)
        }

    }
}