package com.netoprojects.estoquedematerial.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.netoprojects.estoquedematerial.R

/**
 * [NotaListFragment] allows people to click the create note button
 */
class NotaListFragment : Fragment() {

    private var binding: NotaListFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nota_list, container, false)
    }
}