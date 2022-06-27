package com.example.infnet_bl5_fda_at.dados

import com.example.infnet_bl5_fda_at.modelo.Curso
import com.example.infnet_bl5_fda_at.modelo.Experiencia

val cursos = listOf(
    Curso("Formação básica de programador", 1985, "Curso voltado ao ensino de lógica de programação utilizando " +
            "linguagen 'PL/I' com arquivos VSAM e interação com usuário através do CICS/MS"),
    Curso("Curso Java COMPLETO", 2019, "Aprender tudo sobre programação orientada a objetos utilizando Java,  " +
            "desde o básico, com exemplos bem simples e didáticos, e daí vamos gradualmente avançando, até mergulharmos em tópicos avançados"),
    Curso("Bootcamp UX Designer", 2020, "apresentar conceitos fundamentais e avançados de UX design, além de " +
            "proporcionar ao participante o contato com os métodos e técnicas mais adotados pelo mercado. Ao final do " +
            "bootcamp, a pessoa estará apta a ter mais um trabalho para adicionar em seu portfólio."),
    Curso("Desenvolvimento Android Completo", 2021, "Esse é um curso completo que te transformará em um desenvolvedor " +
            "Android, começando do zero! O curso é 100% prático e orientado a projetos, você vai aprender criando apps de verdade!")
)

val experiencias = listOf(
    Experiencia("Eletrodados S/A", "1983 a 1988", "Programador de computador senior"),
    Experiencia("Tratex Investimentos e Participações S/A", "1989 a 1990", "Analista de sistemas Pleno"),
    Experiencia("Prosin Ltda", "1990 a 1991", "Sócio - Analista de sistemas"),
    Experiencia("Meta Informática Ltda", "1992 a 1993", "Administrador de Banco de Dados")
)