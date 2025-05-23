package com.mokaneko.recycle2.ui.kamera

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mokaneko.recycle2.databinding.FragmentKameraBinding

class KameraFragment : Fragment() {

    private var _binding: FragmentKameraBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val kameraViewModel =
            ViewModelProvider(this).get(KameraViewModel::class.java)

        _binding = FragmentKameraBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textKamera
        kameraViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}