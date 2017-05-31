package material.kcci.clickkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //버튼 클릭시
        inputBtn.setOnClickListener{
            //outputText에 inputText를 string으로 가져와서 갖다박음(text)
            outText.text = inputText.text.toString()
        }
    }
}
