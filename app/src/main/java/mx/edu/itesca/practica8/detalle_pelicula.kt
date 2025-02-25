package mx.edu.itesca.practica8

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        // Referencias a las vistas
        val iv_pelicula_image: ImageView = findViewById(R.id.iv_pelicula_imagen)
        val tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
        val tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)

        // Obtener los datos del Intent
        val bundle = intent.extras
        if (bundle != null) {
            val headerImage = bundle.getInt("header", 0)
            val titulo = bundle.getString("titulo", "No Title")
            val sipnosis = bundle.getString("sipnosis", "No description available.")

            // Verificar si los datos están presentes
            if (headerImage != 0) iv_pelicula_image.setImageResource(headerImage)
            tv_nombre_pelicula.text = titulo
            tv_pelicula_desc.text = sipnosis
        }
    }
}
