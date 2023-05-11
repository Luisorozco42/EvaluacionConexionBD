package ni.edu.uca.sistematicopersistencia.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ni.edu.uca.sistematicopersistencia.data.database.BaseDatos
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    const val PRODUCT_DATABASE_NAME = "basedatos"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, BaseDatos::class.java, PRODUCT_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun providesProducto(db: BaseDatos) = db.productoDao()
}