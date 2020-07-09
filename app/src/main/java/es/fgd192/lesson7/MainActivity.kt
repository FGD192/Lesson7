package es.fgd192.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnБереза = findViewById<Button>(R.id.Береза)
        var btnПальма = findViewById<Button>(R.id.Пальма)
        var btnРосток = findViewById<Button>(R.id.Росток)

        var text = "Растет береза"
        btnБереза.setOnClickListener {
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        }
        var text2 = "Растет Пальма"
        btnПальма.setOnClickListener {
            Toast.makeText(applicationContext, text2, Toast.LENGTH_SHORT).show()

            var text3 = "Растет Росток"
            btnРосток.setOnClickListener {
                Toast.makeText(applicationContext, text3, Toast.LENGTH_SHORT).show()


            }
        }
    }
}