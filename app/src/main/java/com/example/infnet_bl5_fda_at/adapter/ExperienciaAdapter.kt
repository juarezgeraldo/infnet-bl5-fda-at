package com.example.infnet_bl5_fda_at.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.infnet_bl5_fda_at.R
import com.example.infnet_bl5_fda_at.modelo.Experiencia

class ExperienciaAdapter (var listaDeExperiencias:List<Experiencia> = listOf())
    : RecyclerView.Adapter<ExperienciaAdapter.ExperienciaViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienciaViewholder {
        val card = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.experiencia_card, parent, false)
        return ExperienciaViewholder(card)
    }

    override fun onBindViewHolder(holder: ExperienciaViewholder, position: Int) {
        val experienciaCorrente = listaDeExperiencias[position]
        holder.txtEmpresa.text = experienciaCorrente.empresa
        holder.txtPeriodoExperiencia.text = experienciaCorrente.periodoExperiencia
        holder.txtCargo.text = experienciaCorrente.cargo
    }

    override fun getItemCount(): Int {
        return listaDeExperiencias.size
    }
    class ExperienciaViewholder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        val txtEmpresa: TextView = itemView.findViewById(R.id.txtEmpresa)
        val txtPeriodoExperiencia: TextView = itemView.findViewById(R.id.txtPeriodoExperiencia)
        val txtCargo: TextView = itemView.findViewById(R.id.txtCargo)
    }


}