package com.example.uykuhesaplay

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.uykuhesaplay.databinding.ActivityKactakalkmaliyimBinding
import com.example.uykuhesaplay.databinding.ActivityKactayatmaliyimBinding
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

class kactakalkmaliyimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKactakalkmaliyimBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKactakalkmaliyimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.textViewbbbb.text="Normal bir insan yattıktan 15 dakika sonra uykuya dalar.\n" +
                "Eğer şu anda yatarsanız aşağıdaki saatlerden birisinde uyanmaya çalışmalısınız:"
        val now = LocalTime.now()
        println("Şu anki zaman: $now")
        val formatter = DateTimeFormatter.ofPattern("HH:mm")
        val formattedTime = now.format(formatter)
        val newTime = now.plusMinutes(15)
        println(newTime)
        var currentHour = now.hour
        var currentMinute = now.minute

        val startTime = now.plus(105, ChronoUnit.MINUTES)
             currentHour = startTime.hour
            currentMinute = startTime.minute
            binding.button1.text="$currentHour:$currentMinute"
        var endTime=startTime.plus(90,ChronoUnit.MINUTES)
            currentHour=endTime.hour
            currentMinute=endTime.minute
             binding.button2.text="$currentHour:$currentMinute"
        endTime=endTime.plus(90,ChronoUnit.MINUTES)
        currentHour=endTime.hour
        currentMinute=endTime.minute
            binding.button3.text="$currentHour:$currentMinute"
        endTime=endTime.plus(90,ChronoUnit.MINUTES)
        currentHour=endTime.hour
        currentMinute=endTime.minute
            binding.button4.text="$currentHour:$currentMinute"
        endTime=endTime.plus(90,ChronoUnit.MINUTES)
        currentHour=endTime.hour
        currentMinute=endTime.minute
            binding.button5.text="$currentHour:$currentMinute"
        endTime=endTime.plus(90,ChronoUnit.MINUTES)
        currentHour=endTime.hour
        currentMinute=endTime.minute
            binding.button6.text="$currentHour:$currentMinute"
        binding.tekrarhesplaBtn.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}


