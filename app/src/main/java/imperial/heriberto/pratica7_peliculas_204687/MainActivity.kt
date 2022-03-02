package imperial.heriberto.pratica7_peliculas_204687

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas:  ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()
        var adapter=AdaptadorMovies(this, peliculas)
        var listview: ListView =findViewById(R.id.listv)
        listview.adapter=adapter
    }

    fun llenar_peliculas(){
        val pelicula1=Pelicula(1,getString(R.string.peliTitulo1),getString(R.string.peliSip1),176,R.drawable.batman)
        peliculas.add(pelicula1)
        val pelicula2=Pelicula(2,getString(R.string.peliTitulo2),getString(R.string.peliSip2),116,R.drawable.unchar)
        peliculas.add(pelicula2)
        val pelicula3=Pelicula(3,getString(R.string.peliTitulo3),getString(R.string.peliSip3),111,R.drawable.pacto)
        peliculas.add(pelicula3)
        val pelicula4=Pelicula(4,getString(R.string.peliTitulo4),getString(R.string.peliSip4),133,R.drawable.licorice)
        peliculas.add(pelicula4)
        val pelicula5=Pelicula(5,getString(R.string.peliTitulo5),getString(R.string.peliSip5),87,R.drawable.adios)
        peliculas.add(pelicula5)
    }
}