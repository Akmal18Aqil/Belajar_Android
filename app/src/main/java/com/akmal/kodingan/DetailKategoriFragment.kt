package com.akmal.kodingan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class DetailKategoriFragment : Fragment() {

    private lateinit var tvNamaKategori: TextView
    private lateinit var tvDeskripsi: TextView
    private lateinit var btnTampilkanProfil: Button
    private lateinit var btnTampilkanDialog: Button
    var deskripsi: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_kategori, container, false)
    }

    companion object {
        var EXTRA_NAMA = "extra_nama"
        var EXTRA_DESKRIPSI = "extra_deskripsi"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvNamaKategori = view.findViewById(R.id.tv_kategori_nama)
        tvDeskripsi = view.findViewById(R.id.tv_deskripsi)
        btnTampilkanProfil = view.findViewById(R.id.btn_show_profil)
        btnTampilkanDialog = view.findViewById(R.id.btn_tampil_dialog)

        if (savedInstanceState != null){
            val descFromBundle = savedInstanceState.getString(EXTRA_DESKRIPSI)
            deskripsi = descFromBundle
        }
        if (arguments != null){
            val namaKategori = arguments?.getString(EXTRA_NAMA)
//            ini bisa digunakan, tinggal dihilangkan saja command nya
//            val deskripsinya = arguments?.getString(EXTRA_DESKRIPSI)
            tvDeskripsi.text = deskripsi
            tvNamaKategori.text = namaKategori
        }
    }


}