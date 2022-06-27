package com.example.infnet_bl5_fda_at.modelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class CadastroViewModel: ViewModel() {
//    val idade = MutableLiveData<String>().apply { value = "" }
//    var nascimento: String = ""
//        set(value) {
//            //podemos validar o valor se quisermos
//            val data = textoPraData(value)
//            idade.value = dataPraIdade(data).toString()
//            // atribui o novo valor à variável
//            field = value
//        }

    val nascimento = MutableLiveData<Date>().apply { value = null }
    var idade: String = ""
        set(value) {
            //podemos validar o valor se quisermos
            val idade = value
            // atribui o novo valor à variável
            field = value
        }

    fun textoPraData(texto: String): Date  =
        SimpleDateFormat("dd/MM/yyyy").parse(texto)

    fun dataPraIdade(data: Date): Int {
        val a = Calendar.getInstance().apply {
            time = data
        }
        val b = Calendar.getInstance() //hoje
        var diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR)
        return if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
            a.get(Calendar.MONTH) == b.get(Calendar.MONTH) &&
            a.get(Calendar.DATE) > b.get(Calendar.DATE)
        ) {
            --diff
        }else diff
    }
}