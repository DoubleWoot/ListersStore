package dwitdisciples.example.listersstore

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categorylist = findViewById<Button>(R.id.btn_equipment)
        categorylist.setOnClickListener{
            val intent = Intent(this, Peripherals::class.java)
            startActivity(intent)
        }

        val pcpartslist = findViewById<Button>(R.id.btn_components)
        pcpartslist.setOnClickListener {
            val intent = Intent(this, Components::class.java)
            startActivity(intent)
        }

        val tb = findViewById<androidx.appcompat.widget.Toolbar>(R.id.tb)
        tb.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.login -> {
                    val intent = Intent(this, LoginSignupActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.docs -> {
                    openDocument()
                    true
                }
                R.id.signup -> {
                    val intent = Intent(this, CreateAccActivity::class.java)
                    startActivity(intent)
                    true
                }
                else ->super.onOptionsItemSelected(it)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    fun openDocument() {
        val docURL = "https://docs.google.com/document/d/10qxCOck3uWiWK2Ccdrc2daWsrP_xeEEVwt9xY8gZKBY"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(docURL)
    }

}