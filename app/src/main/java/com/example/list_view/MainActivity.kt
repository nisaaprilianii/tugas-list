package com.example.list_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var pindah1: TextView;
        lateinit var pindah2: TextView;
        lateinit var pindah3: TextView;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pindah1 = findViewById(R.id.detail1)
        pindah2 = findViewById(R.id.detail2)
        pindah3 = findViewById(R.id.detail3)

        pindah1.setOnClickListener{
            val pindah = Intent(this, halaman_detail::class.java)
            pindah.putExtra("nama", "Shifa Sulastri Adityaningrum")
            pindah.putExtra("nis", "121564674")
            pindah.putExtra("kelas", "XI PPLG 4")
            pindah.putExtra("sekolah", "SMK Marhas Margahayu")
            pindah.putExtra("ttl", "02 Februari 2022")
            pindah.putExtra("alamat", "Jl. Jalan RT 05 RW 06")
            pindah.putExtra("notelepon", "089546746773")
            startActivity(pindah)
        }
        pindah2.setOnClickListener{
            val pindah = Intent(this, halaman_detail::class.java)
            pindah.putExtra("nama", "Zain Miftahul Jannah")
            pindah.putExtra("nis", "126798543")
            pindah.putExtra("kelas", "XI PPLG 4")
            pindah.putExtra("sekolah", "SMK Marhas Margahayu")
            pindah.putExtra("ttl", "03 januarin 2022")
            pindah.putExtra("alamat", "Jl. Jalan RT 05 RW 08")
            pindah.putExtra("notelepon", "081775693421")
            startActivity(pindah)
        }
        pindah3.setOnClickListener{
            val pindah = Intent(this, halaman_detail::class.java)
            pindah.putExtra("nama", "Dinda Syawaliah")
            pindah.putExtra("nis", "125898588")
            pindah.putExtra("kelas", "XI PPLG 1")
            pindah.putExtra("sekolah", "SMK Marhas Margahayu")
            pindah.putExtra("ttl", "04 Maret 2022")
            pindah.putExtra("alamat", "Jl. Jalan RT 05 RW 10")
            pindah.putExtra("notelepon", "089476235786")
            startActivity(pindah)
        }
    }
}