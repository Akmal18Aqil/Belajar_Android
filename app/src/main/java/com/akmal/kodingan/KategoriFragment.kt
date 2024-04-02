package com.akmal.kodingan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class KategoriFragment : Fragment(),View.OnClickListener{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kategori, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnKategori: Button = view.findViewById(R.id.btn_detail_kategori)
        btnKategori.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val detailKategoriFragment = DetailKategoriFragment()
        val bundle = Bundle()
        bundle.putString(DetailKategoriFragment.EXTRA_NAMA, "Sepak Bola")
//        jika menggunakan argument semua maka ini diaktifkan
//        bundle.putString(DetailKategoriFragment.EXTRA_DESKRIPSI, "KATEGORINYA OLAHRAGA")
        val deskripsi = "KATEGORI DARI BIDANG OLAHRAGA"

        detailKategoriFragment.arguments = bundle
        detailKategoriFragment.deskripsi = deskripsi
        val fragmentManager = parentFragmentManager
        fragmentManager.beginTransaction().apply {
            replace(R.id.frame_fragmen, detailKategoriFragment, DetailKategoriFragment::class.java.simpleName)
            addToBackStack(null)
            commit()
        }


    }


}