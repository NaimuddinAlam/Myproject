package com.example.whatssapp.activity

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.whatssapp.R
import com.example.whatssapp.databinding.ActivityHomewBinding
import java.io.File

class Homew : AppCompatActivity() {
    var WHATSAPP_STATUSES_LOCATION="/WhatsApp/Media/.Statuses"
    var homew: ActivityHomewBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homew=DataBindingUtil.setContentView(this,R.layout.activity_homew)
    }

    fun getfiles()
    {
        var file=File(Environment.getExternalStorageDirectory().toString())
    }
}