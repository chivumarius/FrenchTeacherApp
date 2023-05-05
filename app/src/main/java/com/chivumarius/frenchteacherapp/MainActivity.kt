package com.chivumarius.frenchteacherapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // ♦ The "SayTheColor()" Method:
    fun SayTheColor(view: View){    // ♦ import android.view.View
        // ♦ Setting the  Variable
        //      → as "View" → casted as a "Button":
        val clickedButton : Button = view as Button  // ♦ import android.widget.Button

        // ♦ Create "mediaPlayer" Object
        //      → from the "MediaPlayer" Class
        var mediaPlayer: MediaPlayer = MediaPlayer.create(  // ♦ import android.media.MediaPlayer
            this,
           // ♦ "Identifying" the "Audio Files" to be "Played"
            //      → by the "Tag"
            resources.getIdentifier(
                // ♦ PARAM 1: Sound File Name
                clickedButton.tag.toString(),
                // ♦ PARAM 2: "Default Directory":
                "raw",
                // ♦ PARAM 3: "Default Package Name":
                packageName
            )
        )
        // ♦ "Starting Media Player":
        mediaPlayer.start()

    }
}