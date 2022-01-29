package com.example.m4_l9animation

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    private lateinit var imgAnimation:ImageView

    private lateinit var lottieFacebook:LottieAnimationView
    private lateinit var lottieYoutube:LottieAnimationView
    private lateinit var lottieTwitter:LottieAnimationView

    private lateinit var btnZoom:Button
    private lateinit var btnRotate:Button
    private lateinit var btnFade:Button
    private lateinit var btnBlink:Button
    private lateinit var btnMove:Button
    private lateinit var btnSlide:Button
    private lateinit var btnBounce:Button
    private lateinit var btnSequential:Button
    private lateinit var btnTogather:Button
    private lateinit var btnFacebook:Button
    private lateinit var btnYoutube:Button
    private lateinit var btnTwitter:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        imgAnimation = findViewById(R.id.img_animation)

        lottieFacebook = findViewById(R.id.lottie_facebook)
        lottieYoutube = findViewById(R.id.lottie_youtube)
        lottieTwitter = findViewById(R.id.lottie_twitter)

        btnZoom = findViewById(R.id.btn_zoom)
        btnRotate = findViewById(R.id.btn_rotate)
        btnFade = findViewById(R.id.btn_fade)
        btnBlink = findViewById(R.id.btn_blink)
        btnMove = findViewById(R.id.btn_move)
        btnSlide = findViewById(R.id.btn_slide)
        btnBounce = findViewById(R.id.btn_bounce)
        btnSequential = findViewById(R.id.btn_sequential)
        btnTogather = findViewById(R.id.btn_togather)
        btnFacebook = findViewById(R.id.btn_facebook)
        btnYoutube = findViewById(R.id.btn_youtube)
        btnTwitter = findViewById(R.id.btn_twitter)

        btnZoom.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            imgAnimation.startAnimation(animation)
        }

        btnRotate.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
            imgAnimation.startAnimation(animation)
        }

        btnFade.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
            imgAnimation.startAnimation(animation)
        }

        btnBlink.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
            imgAnimation.startAnimation(animation)
        }

        btnMove.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
            imgAnimation.startAnimation(animation)
        }

        btnSlide.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
            imgAnimation.startAnimation(animation)
        }

        btnBounce.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
            imgAnimation.startAnimation(animation)
        }

        btnSequential.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.sequential)
            imgAnimation.startAnimation(animation)
        }

        btnTogather.setOnClickListener {
            lottieTwitter.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.togather)
            imgAnimation.startAnimation(animation)
        }

        btnFacebook.setOnClickListener {
            imgAnimation.visibility = View.GONE
            lottieYoutube.visibility = View.GONE
            lottieTwitter.visibility = View.GONE
            lottieFacebook.visibility = View.VISIBLE
            lottieFacebook.playAnimation()
        }

        btnYoutube.setOnClickListener {
            lottieFacebook.visibility = View.GONE
            lottieTwitter.visibility = View.GONE
            imgAnimation.visibility = View.GONE
            lottieYoutube.visibility = View.VISIBLE
            lottieYoutube.playAnimation()

        }

        btnTwitter.setOnClickListener {
            lottieYoutube.visibility = View.GONE
            lottieFacebook.visibility = View.GONE
            imgAnimation.visibility = View.GONE
            lottieTwitter.visibility = View.VISIBLE
            lottieTwitter.playAnimation()
        }

    }



}