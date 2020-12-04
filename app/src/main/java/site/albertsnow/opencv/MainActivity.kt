package site.albertsnow.opencv

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import org.opencv.android.OpenCVLoader

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun testLoading(view: View) {
        val success = OpenCVLoader.initDebug()
        val message = if (success) "Loading Success" else "Loading Failure-----"
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}