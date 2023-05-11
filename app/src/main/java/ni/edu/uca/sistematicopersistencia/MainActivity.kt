package ni.edu.uca.sistematicopersistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import ni.edu.uca.sistematicopersistencia.databinding.ActivityMainBinding
import ni.edu.uca.sistematicopersistencia.domain.model.ProductoInsert
import ni.edu.uca.sistematicopersistencia.ui.ViewModelProducto

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewmodel: ViewModelProducto by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn: Button = binding.guardar

        btn.setOnClickListener{
            var producto = ProductoInsert(binding.etNombre.text.toString(), binding.etPrecio.text.toString().toDouble(), binding.etExistencia.text.toString().toInt())
            viewmodel.insertProducto(producto)
        }

    }
}