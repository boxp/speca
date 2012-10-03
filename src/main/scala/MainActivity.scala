package alice.scala.speca

import _root_.android.os.Bundle
import _root_.android.app.Activity
import _root_.android.widget.Toast

class MainActivity extends Activity with TypedActivity {

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
  }

  override def onStart() {
    super.onStart()
    Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show()
  }

  override def onRestart() {
    super.onRestart()
    Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show()
  }

  override def onResume() {
    super.onRestart()
    Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show()
  }
  
  override def onPause() {
    super.onRestart()
    Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()
  }

  override def onStop() {
    super.onStop()
    Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()
  }

  override def onDestroy() {
    super.onDestroy()
    Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()
  }
}
