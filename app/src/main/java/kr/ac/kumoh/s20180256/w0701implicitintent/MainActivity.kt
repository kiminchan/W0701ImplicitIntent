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
            var uri = Uri.parse("http://bwoh.githun.io")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        //setContentView(R.layout.activity_main)
    }
}