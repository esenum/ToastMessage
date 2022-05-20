package com.umutesen.kotlinalertdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.umutesen.kotlinalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Toast.makeText(this@MainActivity,"Welcome",Toast.LENGTH_LONG).show()
    }

    fun save(view: View){
        val alert= AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")

        alert.setPositiveButton("Yes") {dialog, which ->

            //OnClick Listener
            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
        }

        alert.setNegativeButton("No") {dialog, which ->

            //OnClick Listener
            Toast.makeText(applicationContext," Not Saved",Toast.LENGTH_LONG).show()
        }

        alert.show()

    }
}