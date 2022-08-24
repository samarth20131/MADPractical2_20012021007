package com.example.madpractical2_20012021007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.myCoordinatorLayout)
        Log.i(TAG, "onCreate: onCreate method is called")
        Toast.makeText(this,"onCreate: onCreate method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.myCoordinatorLayout)
        Log.i(TAG, "onStart: onStart method is called")
        Toast.makeText(this,"onStart: onStart method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onStart method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.myCoordinatorLayout)
        Log.i(TAG, "onResume: onResume method is called")
        Toast.makeText(this,"onResume: onResume method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onResume method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.myCoordinatorLayout)
        Log.i(TAG, "onPause: onPause method is called")
        Toast.makeText(this,"onPause: onPause method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onPause method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.myCoordinatorLayout)
        Log.i(TAG, "onStop: onStop method is called")
        Toast.makeText(this,"onStop: onStop method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onStop method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart:OnRestart method is called ")
        Toast.makeText(this,"OnRestart:OnRestart method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            "onRestart method is called",
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.myCoordinatorLayout)
        Log.i(TAG, "onDestroy: onDestroy method is called")
        Toast.makeText(this,"onDestroy: onDestroy method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onDestroy method is called",Snackbar.LENGTH_LONG).show()
    }

}