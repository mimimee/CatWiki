package com.itsnotme.starwars.presentation.detailinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.itsnotme.starwars.R
import com.itsnotme.starwars.databinding.FragmentDetailInfoBinding

class DetailInfoFragment : Fragment(R.layout.fragment_detail_info) {
    private var _binding: FragmentDetailInfoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetailInfoBinding.bind(view)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}