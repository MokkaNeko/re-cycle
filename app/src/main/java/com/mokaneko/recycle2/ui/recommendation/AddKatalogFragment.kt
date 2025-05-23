package com.mokaneko.recycle2.ui.recommendation

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokaneko.recycle2.R

class AddKatalogFragment : Fragment() {

    companion object {
        fun newInstance() = AddKatalogFragment()
    }

    private val viewModel: AddKatalogViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_add_katalog, container, false)
    }
}