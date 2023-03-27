package dwitdisciples.example.listersstore

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class Peripherals : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_list)

        val keyboard_items = findViewById<Button>(R.id.btn_keyboard)
        keyboard_items.setOnClickListener{
            val intent = Intent(this, KeyboardItems::class.java)
            startActivity(intent)
        }

        val mouse_items = findViewById<Button>(R.id.btn_mouse)
        mouse_items.setOnClickListener{
            val intent = Intent(this, MouseItems::class.java)
            startActivity(intent)
        }

        val headphones_items = findViewById<Button>(R.id.btn_headphones)
        headphones_items.setOnClickListener{
            val intent = Intent(this, HeadphonesItems::class.java)
            startActivity(intent)
        }

        val mousepad_items = findViewById<Button>(R.id.btn_mousepad)
        mousepad_items.setOnClickListener{
            val intent = Intent(this, MousepadItems::class.java)
            startActivity(intent)
        }

        val earphones_items = findViewById<Button>(R.id.btn_earphones)
        earphones_items.setOnClickListener{
            val intent = Intent(this, EarphonesItems::class.java)
            startActivity(intent)
        }

        val monitor_items = findViewById<Button>(R.id.btn_monitor)
        monitor_items.setOnClickListener{
            val intent = Intent(this, MonitorItems::class.java)
            startActivity(intent)
        }
    }


    fun doBack(v: View?) {
        finish()
    }
}