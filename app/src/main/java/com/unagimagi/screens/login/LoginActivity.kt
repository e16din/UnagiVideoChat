package com.unagimagi.screens.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.unagimagi.R
import com.unagimagi.screens.rooms.RoomsActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    // Events

    override fun onCreate(savedInstanceState: Bundle?) {
        val isAuthorized = false //todo:
        if (isAuthorized) {
            showRoomsScreen()
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        vLoginButton.setOnClickListener {
            //todo: request server

            //todo: on success
            showRoomsScreen()

            //todo: on fail
        }


    }

    // Actions

    fun showRoomsScreen() {
        val intent = Intent(this, RoomsActivity::class.java)
        startActivity(intent)
    }
}
