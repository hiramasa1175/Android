package jp.hiramasa.numberpicker

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.LayoutInflater
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.off_dialog.view.*

class MainActivity : AppCompatActivity() {

  var off = ""

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button1.setOnClickListener {
      setOff()
    }
  }

  private fun setOff() {
    val inflater = this.getSystemService(
        Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val layout = inflater.inflate(R.layout.off_dialog,
        findViewById(R.id.layout_root))

    layout.numPicker1.minValue = 0
    layout.numPicker1.maxValue = 9

    layout.numPicker2.minValue = 0
    layout.numPicker2.maxValue = 9

    val builder = AlertDialog.Builder(this)
    builder.setTitle("～パーセント引き")
    builder.setView(layout)
    builder.setPositiveButton("OK") { _, _ ->
      off = layout.numPicker1.value.toString() + layout.numPicker2.value.toString()
    }
    builder.setNegativeButton("Cancel") { _, _ ->
    }

    builder.create().show()
  }
}
