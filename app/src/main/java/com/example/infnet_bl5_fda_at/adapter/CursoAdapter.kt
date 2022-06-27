package com.example.infnet_bl5_fda_at.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.infnet_bl5_fda_at.R
import com.example.infnet_bl5_fda_at.modelo.Curso

class CursoAdapter (    var listaDeCursos:List<Curso> = listOf())
    : RecyclerView.Adapter<CursoAdapter.CursoViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursoViewholder {
        val card = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.curso_card, parent, false)
        return CursoViewholder(card)
    }

    override fun onBindViewHolder(holder: CursoViewholder, position: Int) {
        val cursoCorrente = listaDeCursos[position]
        holder.txtNomeCurso.text = cursoCorrente.nomeCurso
        holder.txtAnoCurso.text = cursoCorrente.anoCurso.toString()
        holder.txtDescricaoCurso.text = cursoCorrente.descricaoCurso
    }

    override fun getItemCount(): Int {
        return listaDeCursos.size
    }
    class CursoViewholder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        val txtNomeCurso: TextView = itemView.findViewById(R.id.txtCurso)
        val txtAnoCurso: TextView = itemView.findViewById(R.id.txtPeriodo)
        val txtDescricaoCurso: TextView = itemView.findViewById(R.id.txtDescricao)
    }


}