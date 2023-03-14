package mx.edu.itson.examenu2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val button: Button = findViewById(R.id.btn_detalles)
        val button2: Button = findViewById(R.id.btn_globos)
        val button3: Button = findViewById(R.id.btn_peluches)
        val button4: Button = findViewById(R.id.btn_regalos)
        val button5: Button = findViewById(R.id.btn_tazas)

        button.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)

            startActivity(intent)
        }

    }
}