package com.akmal.kodingan

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment


class ModalDialogFragment : DialogFragment() {
    private lateinit var btnTutup: Button
    private lateinit var btnPilih: Button
    private lateinit var rgSoal: RadioGroup
    private lateinit var rbAnanta: RadioButton
    private lateinit var rbNanda: RadioButton
    private lateinit var rbMira: RadioButton
    private lateinit var rbWinona: RadioButton
    private var dialogListener: onDialogListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modal_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnTutup = view.findViewById(R.id.btn_tutup)
        btnPilih = view.findViewById(R.id.btn_pilih)
        rgSoal = view.findViewById(R.id.rg_soal)
        rbAnanta = view.findViewById(R.id.rb_ananta)
        rbMira = view.findViewById(R.id.rb_mira)
        rbNanda = view.findViewById(R.id.rb_nanda)
        rbWinona = view.findViewById(R.id.rb_winona)

        btnPilih.setOnClickListener {
            val radioYangTerpilih = rgSoal.checkedRadioButtonId
            if (radioYangTerpilih != -1){
                var pacar: String? = when (radioYangTerpilih){
                    R.id.rb_winona -> rbWinona.text.toString().trim()
                    R.id.rb_nanda -> rbNanda.text.toString().trim()
                    R.id.rb_mira -> rbMira.text.toString().trim()
                    R.id.rb_ananta -> rbAnanta.text.toString().trim()
                    else -> null
                }
                dialogListener?.onOptionPilih(pacar)
                dialog?.dismiss()
            }
        }
        btnTutup.setOnClickListener {
            dialog?.cancel()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val fragment = parentFragment
        if (fragment is DetailKategoriFragment){
            this.dialogListener = fragment.dialogListener
        }
    }

    override fun onDetach() {
        super.onDetach()
        this.dialogListener = null
    }

    interface onDialogListener{
        fun onOptionPilih(text: String?)
    }


}