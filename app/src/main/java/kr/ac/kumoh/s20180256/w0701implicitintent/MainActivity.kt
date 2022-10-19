package kr.ac.kumoh.s20180256.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180256.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnHomepage.setOnClickListener {
            var uri = Uri.parse("https://www.instagram.com/dlwlrma/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener {
            //var uri = Uri.parse("geo:36.145014,128.393047?z=17")
            var uri = Uri.parse("geo:0,0?z=17&q=경북 구미시 대학로 3길 38")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnTelephone.setOnClickListener {
            var uri = Uri.parse("sms:010-4614-7221")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        //setContentView(R.layout.activity_main)
    }
}