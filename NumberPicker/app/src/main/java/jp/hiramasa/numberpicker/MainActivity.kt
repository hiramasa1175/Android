package jp.hiramasa.numberpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  var formula = 1000
  var result = ""

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    numPicker1.maxValue = 9
    numPicker1.minValue = 0

    numPicker2.maxValue = 9
    numPicker2.minValue = 0

    button1.setOnClickListener {
      result = numPicker1.value.toString() + numPicker2.value.toString()

      println(result.toInt())
    }
  }
}
