package com.example.uykuhesaplay

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.uykuhesaplay.databinding.ActivityKactayatmaliyimBinding
import com.example.uykuhesaplay.databinding.ActivityMainBinding
import java.sql.Time
import java.time.LocalTime
import java.time.temporal.ChronoUnit

class kactayatmaliyimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKactayatmaliyimBinding
    lateinit var sonrakiTime:LocalTime
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKactayatmaliyimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var gelenintent=intent
        var gelensaat=gelenintent.getIntExtra("saat",0)
        var gelendakika=gelenintent.getIntExtra("dakika",0)
        val gelenTime = LocalTime.of(gelensaat,gelendakika)
        binding.textViewaaaa.text="Normal bir insan yattıktan 15 dakika sonra uykuya dalar.\n" +
                "Eğer şu saate $gelenTime da uyanmak istiyorsanız, aşağıdaki saatlerden birisinde yatmalısınız:"

        val ilkTime = gelenTime.minus(105, ChronoUnit.MINUTES)
           binding.button6.text=ilkTime.toString()
            sonrakiTime=ilkTime.minus(90,ChronoUnit.MINUTES)
        binding.button5.text=sonrakiTime.toString()
            sonrakiTime=sonrakiTime.minus(90,ChronoUnit.MINUTES)
        binding.button4.text=sonrakiTime.toString()
            sonrakiTime=sonrakiTime.minus(90,ChronoUnit.MINUTES)
        binding.button3.text=sonrakiTime.toString()
            sonrakiTime=sonrakiTime.minus(90,ChronoUnit.MINUTES)
        binding.button2.text=sonrakiTime.toString()
            sonrakiTime=sonrakiTime.minus(90,ChronoUnit.MINUTES)
        binding.button1.text=sonrakiTime.toString()





        binding.TekrarhesplaBtn.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}