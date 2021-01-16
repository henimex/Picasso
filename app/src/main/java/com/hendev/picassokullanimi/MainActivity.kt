package com.hendev.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDoYourThing.setOnClickListener {

            val url = "https://jhenimex.000webhostapp.com/images/f_6underground.jpg"
            Picasso.get()
                    .load(url)
                    .resize(300,600)
                    .rotate(55f)
                    .placeholder(R.drawable.placeholder)
                    .error(R.drawable.error_image)
                    .into(imageView)

        }
    }
}