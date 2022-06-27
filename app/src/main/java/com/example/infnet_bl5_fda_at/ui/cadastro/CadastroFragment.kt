package com.example.infnet_bl5_fda_at.ui.cadastro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnFocusChangeListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.infnet_bl5_fda_at.R
import com.example.infnet_bl5_fda_at.databinding.FragmentCadastroBinding
import com.example.infnet_bl5_fda_at.modelo.CadastroViewModel


class CadastroFragment : Fragment() {

    private var _binding: FragmentCadastroBinding? = null
    private lateinit var cadastroViewModel: CadastroViewModel


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCadastroBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {act->
            cadastroViewModel = ViewModelProvider(act)
                .get(CadastroViewModel::class.java)
        }

        val txtNascimento: TextView = view.findViewById(R.id.txtNascimento)
        val txtIdade: TextView = view.findViewById(R.id.txtIdade)

        txtNascimento.setOnFocusChangeListener(OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) { //perdeu o foco
                if (txtNascimento.text != null) {
                    txtIdade.text = cadastroViewModel.dataPraIdade(
                        cadastroViewModel.textoPraData(txtNascimento.text.toString())
                    ).toString() + " anos"
                }
            }
        })

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}