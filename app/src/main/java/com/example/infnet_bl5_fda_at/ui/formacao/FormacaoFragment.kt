package com.example.infnet_bl5_fda_at.ui.formacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.infnet_bl5_fda_at.R
import com.example.infnet_bl5_fda_at.adapter.CursoAdapter
import com.example.infnet_bl5_fda_at.dados.cursos
import com.example.infnet_bl5_fda_at.modelo.CursoViewModel

class FormacaoFragment : Fragment() {
    private lateinit var cursoViewModel: CursoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_formacao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            cursoViewModel = ViewModelProvider(this).get(CursoViewModel::class.java)
        }
        val txtInstituicao: TextView = view.findViewById(R.id.txtInstituicao)
        txtInstituicao.text = "Instituto INFNET"
        val txtPeriodo: TextView = view.findViewById(R.id.txtPeriodo)
        txtPeriodo.text = "2020 - 2023"

        val recyclerview = view.findViewById<RecyclerView>(R.id.lista_cursos)
        val adapter = CursoAdapter(cursos)
        recyclerview.adapter = adapter

    }
}