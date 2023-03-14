package com.blez.compilerx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blez.compilerx.ui.compiler.CompilerActivity
import dagger.hilt.android.AndroidEntryPoint
import java.util.Timer
import kotlin.concurrent.timerTask

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeIntent()
    }
    private fun changeIntent(){
        val timeTasks = timerTask {
            val intent = Intent(this@MainActivity, CompilerActivity::class.java)
            startActivity(intent)
        }
        val timer = Timer()
        timer.schedule(timeTasks,5000)
    }
}