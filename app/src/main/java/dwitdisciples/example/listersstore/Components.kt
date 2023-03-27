package dwitdisciples.example.listersstore

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class Components : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pc_parts)

        val cpu_items = findViewById<Button>(R.id.btn_cpu)
        cpu_items.setOnClickListener{
            val intent = Intent(this, CPUItems::class.java)
            startActivity(intent)
        }

        val mboard_items = findViewById<Button>(R.id.btn_motherboard)
        mboard_items.setOnClickListener{
            val intent = Intent(this, MBoardItems::class.java)
            startActivity(intent)
        }

        val psupply_items = findViewById<Button>(R.id.btn_powsupply)
        psupply_items.setOnClickListener{
            val intent = Intent(this, PSuppItems::class.java)
            startActivity(intent)
        }

        val gpu_items = findViewById<Button>(R.id.btn_gpu)
        gpu_items.setOnClickListener{
            val intent = Intent(this, GPUItems::class.java)
            startActivity(intent)
        }

        val case_items = findViewById<Button>(R.id.btn_case)
        case_items.setOnClickListener{
            val intent = Intent(this, CaseItems::class.java)
            startActivity(intent)
        }

        val ram_items = findViewById<Button>(R.id.btn_ram)
        ram_items.setOnClickListener{
            val intent = Intent(this, RAMItems::class.java)
            startActivity(intent)
        }
    }


    fun doBack(v: View?) {
        finish()
    }
}