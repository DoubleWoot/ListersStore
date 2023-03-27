package dwitdisciples.example.listersstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.sign

class LoginSignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_signup_layout)

        val editEmail = findViewById<EditText>(R.id.etLoginEmail)
        val editPassword = findViewById<EditText>(R.id.etLoginPassword)
        val login = findViewById<Button>(R.id.btn_login)
        val dbh = DatabaseHelper(this)

        val signup = findViewById<Button>(R.id.btn_signup)
        signup.setOnClickListener{
            val intent = Intent(this, CreateAccActivity::class.java)
            startActivity(intent)
        }

        login.setOnClickListener{
            val emailtx = editEmail.text.toString()
            val passtx = editPassword.text.toString()
            val intent = Intent(this, MainActivity::class.java)

            if (TextUtils.isEmpty(emailtx) || TextUtils.isEmpty(passtx)){
                Toast.makeText(this, "Enter email and password", Toast.LENGTH_SHORT).show()
            }
            else {
                val userAuth = dbh.checkuserpass(emailtx, passtx)
                if (userAuth == true){
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Incorrect Email or Password", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


}