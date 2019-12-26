package com.example.roomdata

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var usefulViewModel: UsefulViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize a RecycleView adapter

        //Initialize the ViewModel


        fab.setOnClickListener{
            val intent = Intent(this, AddActivity::class.java)
            startActivityForResult(intent,REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode== Activity.RESULT_OK){
            //TODO : Save a useful record to the database
            Toast.makeText(this,"Record saved",Toast.LENGTH_SHORT).show()
        }
    }
    companion object{
        const val REQUEST_CODE=1
    }
}
