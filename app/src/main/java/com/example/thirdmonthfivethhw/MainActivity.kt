package com.example.thirdmonthfivethhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thirdmonthfivethhw.databinding.ActivityMainBinding

/*Нужно сделать кнопку с текстом "+1" и textView, при нажатии кнопки нужно с 0 прибавлять по одному до 10ти,
когда доходим до 10ти нужно на кнопке поменять текст на "-1" и при нажатии на кнопку отнимать до 0.
Когда доходим до нуля опять "+1" и так до бесконечности.
Удачи!*/
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextInt.setOnClickListener {
            count++
            if (count == 11){
                binding.textview.text = "-1"
                count = -1
            } else{
                binding.textview.text = count.toString()
            }
        }
    }
}