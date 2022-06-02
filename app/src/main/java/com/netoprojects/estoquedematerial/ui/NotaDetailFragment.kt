package com.netoprojects.estoquedematerial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.netoprojects.estoquedematerial.R

/**
 * A simple [Fragment] subclass.
 * Use the [NotaDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NotaDetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nota_detail, container, false)
    }
}