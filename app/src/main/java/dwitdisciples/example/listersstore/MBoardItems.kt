package dwitdisciples.example.listersstore

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MBoardItems: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mboard_items)

        val relativeLayout = findViewById<RelativeLayout>(R.id.item1)
        relativeLayout.setOnClickListener {
            onClickCheckOut()
        }

        val relativeLayout2 = findViewById<RelativeLayout>(R.id.item2)
        relativeLayout2.setOnClickListener {
            onClickCheckOut()
        }

        val relativeLayout3 = findViewById<RelativeLayout>(R.id.item3)
        relativeLayout3.setOnClickListener {
            onClickCheckOut()
        }

        val relativeLayout4 = findViewById<RelativeLayout>(R.id.item4)
        relativeLayout4.setOnClickListener {
            onClickCheckOut()
        }
    }

    fun onClickCheckOut(){
        val intent = Intent(this, Checkout::class.java)
        startActivity(intent)
    }


}