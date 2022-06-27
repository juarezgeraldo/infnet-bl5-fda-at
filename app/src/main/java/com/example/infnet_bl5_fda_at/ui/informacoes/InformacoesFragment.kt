package com.example.infnet_bl5_fda_at.ui.informacoes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.infnet_bl5_fda_at.R
import com.example.infnet_bl5_fda_at.databinding.FragmentInformacoesBinding

class InformacoesFragment : Fragment() {

    private var binding: FragmentInformacoesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentInformacoesBinding.inflate(inflater, container, false)
        val root: View = fragmentBinding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView_Nome: TextView = view.findViewById(R.id.textView_Nome)
        textView_Nome.text = "Juarez Geraldo da Silva Junior"

        val textView_Endereco: TextView = view.findViewById(R.id.textView_Endereco)
        textView_Endereco.text = "Rua José Antenor, 237 - apto 401 - Bairro Heliópolis"

        val textView_Cidade: TextView = view.findViewById(R.id.textView_Cidade)
        textView_Cidade.text = "Belo Horizonte"

        val textView_Estado: TextView = view.findViewById(R.id.textView_Estado)
        textView_Estado.text = "Minas Gerais"

        val textView_Telefone: TextView = view.findViewById(R.id.textView_Telefone)
        textView_Telefone.text = "(31) 98449-4471"

        val textView_Email: TextView = view.findViewById(R.id.textView_Email)
        textView_Email.text = "juarezgeraldosilva@gmail.com"

        val imgPessoa: ImageView = view.findViewById(R.id.imgPessoa)
        imgPessoa.setImageResource(R.drawable.foto)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,
            object : OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    findNavController().navigateUp()
                }
            })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}