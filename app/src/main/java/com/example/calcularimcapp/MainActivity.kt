package com.example.calcularimcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w("lifecycle", "entrei no CREATE - estou criando a tela")
//        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecyle", "entrei no START - deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecyle", "entrei no RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecyle", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecyle", "STOP - a tela não está mais visível, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecyle", "\nRESTART - a tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecyle", "\nDESTROY - ah não! a tela foi destruída")
    }

}