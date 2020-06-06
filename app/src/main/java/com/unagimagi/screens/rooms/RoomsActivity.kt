package com.unagimagi.screens.rooms

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.unagimagi.R
import com.unagimagi.screens.roulettechat.RouletteChatActivity
import kotlinx.android.synthetic.main.activity_rooms.*

class RoomsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooms)

        vBeginButton.setOnClickListener {
            showRouletteChatScreen()
        }
    }

    fun showRouletteChatScreen() {
        val intent = Intent(this, RouletteChatActivity::class.java)
        startActivity(intent)
    }
}
