package com.example.list_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class halaman_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var kembali : Button
        lateinit var gambar : ImageView
        lateinit var vnama : TextView
        lateinit var vnis : TextView
        lateinit var vkelas : TextView
        lateinit var vsekolah : TextView
        lateinit var vttl :  TextView
        lateinit var valamat : TextView
        lateinit var vnotelepon :TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_detail)
        vnama = findViewById(R.id.tv_nama)
        vnis = findViewById(R.id.tv_nis)
        vkelas = findViewById(R.id.tv_kelas)
        vsekolah = findViewById(R.id.tv_sekolah)
        vttl = findViewById(R.id.tv_ttl)
        valamat = findViewById(R.id.tv_alamat)
        vnotelepon = findViewById(R.id.tv_notelp)
        val nama:String = intent.getStringExtra("nama").toString()
        val nis:String = intent.getStringExtra("nis").toString()
        val kelas:String = intent.getStringExtra("kelas").toString()
        val sekolah:String = intent.getStringExtra("sekolah").toString()
        val ttl:String = intent.getStringExtra("ttl").toString()
        val alamat:String = intent.getStringExtra("alamat").toString()
        val notelepon:String = intent.getStringExtra("notelepon").toString()
        kembali = findViewById(R.id.btnkembali)
        gambar = findViewById(R.id.imeg)

        when(nis) {
            "121564674" -> gambar.setImageResource(R.drawable.img1)
            "126798543" -> gambar.setImageResource(R.drawable.img2)
            "125898588" -> gambar.setImageResource(R.drawable.img3)
        }

        vnama.setText(":     "+ nama)
        vnis.setText(":     "+ nis)
        vkelas.setText(":     "+ kelas)
        vsekolah.setText(":     "+ sekolah)
        vttl.setText(":     "+ ttl)
        valamat.setText(":     "+ alamat)
        vnotelepon.setText(":     "+ notelepon)

        kembali.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }
    }
}