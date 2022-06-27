package com.example.infnet_bl5_fda_at.modelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CursoViewModel: ViewModel() {
    val cursos = MutableLiveData<List<Curso>>()
}