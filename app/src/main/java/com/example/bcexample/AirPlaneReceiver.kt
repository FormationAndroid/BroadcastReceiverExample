package com.example.bcexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class AirPlaneReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("debugApp", "Broadcast received")
    }

}