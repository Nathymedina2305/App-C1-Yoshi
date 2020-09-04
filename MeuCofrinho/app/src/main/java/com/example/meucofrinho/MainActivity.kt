package com.example.meucofrinho

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueAqui (v:View){
        val valor1 = et_va.text.toString().toDouble()
        val valor2 = et_vb.text.toString().toDouble()
        val calc = valor1 + valor2
        val name = et_nmc.text

        val text = et_nmc.getText().toString();
        val l = text.length;
        val text1 = et_va.getText().toString().toDouble()
        val a = text1
        val text2 = et_vb.getText().toString().toDouble()
        val b = text2

        if (l <= 0) {
            et_nmc.setError("Escreva um nome com pelo menos uma letra!!")
            /*Toast.makeText(this, "Escreva um nome com pelo menos uma letra!!", Toast.LENGTH_SHORT).show()
            tv_resultado.setText("Valor total")
            tv_resultado.setTextColor(Color.parseColor("#787880"))
            */
        }
        else if (a <= 0){
            et_va.setError("Escreva um valor maior que zero!!")
        }

        else if (b <= 0.0 ){
            et_vb.setError("Escreva um valor maior que zero!!")
            /*Toast.makeText(this, "Escreva um valor maior que zero!!", Toast.LENGTH_SHORT).show()
            tv_resultado.setText("Valor total")
            tv_resultado.setTextColor(Color.parseColor("#787880"))
            */
        }
        else{
            if (calc <= 50.0) {
                tv_resultado.run {
                    tv_resultado.setText("Total do cofrinho ${name} é de R$ ${String.format("%.2f", calc)}")
                    tv_resultado.setTextColor(Color.RED)
                }
            }

            else if (calc >= 51.0) {
                tv_resultado.run {
                    tv_resultado.setText("Total do cofrinho ${name} é de R$ ${String.format("%.2f", calc)}")
                    tv_resultado.setTextColor(Color.GREEN)
                }
            }
        }




    }

}