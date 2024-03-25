package com.akmal.kodingan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class LatihanFragment : Fragment(),View.OnClickListener{


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latihan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button_category: Button = view.findViewById(R.id.button_category)
        button_category.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.button_category){
            val kategoriFragment = KategoriFragment()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.frame_fragmen, kategoriFragment, KategoriFragment::class.java.simpleName)
                addToBackStack(null)
                commit()

            }
        }
    }


}