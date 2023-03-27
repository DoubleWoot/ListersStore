package dwitdisciples.example.listersstore

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class Checkout :Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout)

        val homepage = findViewById<Button>(R.id.btn_toconfirm)
        homepage.setOnClickListener{
            val intent = Intent(this, PaymentConfirmation::class.java)
            startActivity(intent)
        }


    }
}