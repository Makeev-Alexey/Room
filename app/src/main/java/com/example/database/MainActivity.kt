package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginViewModel : LoginViewModel = ViewModelProvider(this).get(LoginViewModel :: class.java)
//        loginViewModel.insertData(this, "fgsfdgd", "fsdfd")
//        loginViewModel.getLoginDetails(this, "fgsfdgd")?.observe(this, {
//            println(it)
//        })
        loginViewModel.getSavedSubscribers(this).observe(this,{println(it)})
    }
}