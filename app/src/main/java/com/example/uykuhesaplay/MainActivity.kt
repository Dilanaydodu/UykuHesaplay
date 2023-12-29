package com.example.uykuhesaplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import com.example.uykuhesaplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var ListSaat:List<Any>
    lateinit var ListDakika:List<Any>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent1=Intent(this,kactakalkmaliyimActivity::class.java)
        val intent2=Intent(this,kactayatmaliyimActivity::class.java)
        ListSaat= listOf("00","01","02","03","04","05","06","07","08","09",10,11,12,13,14,15,16,17,18,19,20,21,22,23)
        ListDakika= listOf("00",10,15,20,25,30,35,40,45,50,55)
       binding.spinnerSaat.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,ListSaat)
        binding.spinnerSaat.onItemSelectedListener= object : OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               var  a=ListSaat[position].toString().toInt()
                intent2.putExtra("saat",a)

            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                intent2.putExtra("saatsecilmeyen",8)
            }

        }
        binding.spinnerDakika.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,ListDakika)
        binding.spinnerDakika.onItemSelectedListener= object : OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var  b=ListDakika[position].toString().toInt()
                intent2.putExtra("dakika",b)

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                intent2.putExtra("dakikasecilmeyen",30)
            }

        }
        binding.kactakalkmaliyim.setOnClickListener {
           // intent1=Intent(this,kactakalkmaliyimActivity::class.java)
            startActivity(intent1)

        }
        binding.kactayatmaliyim.setOnClickListener {
           // intent2=Intent(this,kactayatmaliyimActivity::class.java)
            startActivity(intent2)
        }

    }
}
