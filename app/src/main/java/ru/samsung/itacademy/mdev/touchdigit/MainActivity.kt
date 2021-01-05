package ru.samsung.itacademy.mdev.touchdigit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val m:Array<Int> = arrayOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven)
    var i =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val iv = findViewById<ImageView>(R.id.iv)
        iv.setOnTouchListener { view, motionEvent ->
            when(motionEvent.getAction()) {
                MotionEvent.ACTION_DOWN -> iv.setImageResource(m[(i++) % m.size])
                MotionEvent.ACTION_UP -> iv.rotation = 45f * i
            }
            true
        }
    }
}