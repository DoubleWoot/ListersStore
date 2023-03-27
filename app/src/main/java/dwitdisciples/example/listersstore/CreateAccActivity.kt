package dwitdisciples.example.listersstore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.text.TextUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CreateAccActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_layout)

        val email = findViewById<EditText>(R.id.etCreateEmail)
        val password = findViewById<EditText>(R.id.etCreatePassword)
        val db = DatabaseHelper(this)

        val signUpButton = findViewById<Button>(R.id.btnCreateAcc)
        signUpButton.setOnClickListener {
            val intent = Intent(this, LoginSignupActivity::class.java)
            val emailString = email.text.toString()
            val passwordString = password.text.toString()
            val savedData = db.insertdata(emailString, passwordString)

            if (TextUtils.isEmpty(emailString) || TextUtils.isEmpty(passwordString)){
                Toast.makeText(this, "Please add your email and password", Toast.LENGTH_SHORT).show()
            }
            else{
                if (savedData){
                    Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "This user already exists", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}