package com.netoprojects.estoquedematerial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.netoprojects.estoquedematerial.R

/**
 * A simple [Fragment] subclass.
 * Use the [AddNotaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddNotaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_nota, container, false)
    }
}
