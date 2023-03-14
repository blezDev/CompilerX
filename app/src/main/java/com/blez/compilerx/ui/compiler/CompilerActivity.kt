package com.blez.compilerx.ui.compiler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.blez.compilerx.R
import com.blez.compilerx.databinding.ActivityCompilerBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CompilerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCompilerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_compiler)

    }
}