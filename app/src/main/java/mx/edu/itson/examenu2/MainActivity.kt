package mx.edu.itson.examenu2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_visitar)

        button.setOnClickListener {
            var intent: Intent = Intent(this, Principal::class.java)
            startActivity(intent)
        }
    }
}