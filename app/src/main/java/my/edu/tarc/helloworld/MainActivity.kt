package my.edu.tarc.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout

//instance name: Type/class name
class MainActivity : AppCompatActivity() {
    //onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Load UI to memory
        //R = resources
        setContentView(R.layout.activity_main)

        //Linking UI to program code
        //Declare var here
        //val = value(no intent to change like const in js), var = variable
        val imageViewQR: ImageView=findViewById(R.id.imageViewQR)
        val textViewName: TextView=findViewById(R.id.textViewName)
        val button2Show: Button=findViewById(R.id.button2Show)
        val button3Hide= findViewById<Button>(R.id.button3Hide)//another option for declaration

        //Insert event listener
        button2Show.setOnClickListener {
            imageViewQR.visibility= View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }
        button3Hide.setOnClickListener {
            imageViewQR.visibility= View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }
    }
}