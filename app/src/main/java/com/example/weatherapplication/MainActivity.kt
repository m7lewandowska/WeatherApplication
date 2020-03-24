package com.example.weatherapplication

import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import java.net.URL
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BTN1.setOnClickListener {
            val cityName = CityName_Input2.text
            changeActivity(this, cityName.toString())
        }
    }

    companion object {
        fun changeActivity(context: Context, cityName: String) {
            val intent = Intent(context, WeatherActivity::class.java)
            intent.putExtra("cityName", cityName)
            context.startActivity(intent)
        }
    }
}