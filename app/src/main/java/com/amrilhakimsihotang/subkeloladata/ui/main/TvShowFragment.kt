package com.amrilhakimsihotang.subkeloladata.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.amrilhakimsihotang.subkeloladata.adapter.TiviShowAdapter
import com.amrilhakimsihotang.subkeloladata.databinding.FragmentTvShowBinding
import com.amrilhakimsihotang.subkeloladata.viewmodel.TiviViewModel
import com.amrilhakimsihotang.subkeloladata.viewmodel.ViewModelFactory
import com.amrilhakimsihotang.subkeloladata.vo.Status


class TvShowFragment : Fragment() {

    private lateinit var tiviShowAdapter: TiviShowAdapter
    private lateinit var binding: FragmentTvShowBinding
    private lateinit var tiviViewModel: TiviViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())

            tiviViewModel = ViewModelProvider(
                requireActivity(), factory
            ).get(TiviViewModel::class.java)
            tiviShowAdapter = TiviShowAdapter()
            binding.progressBar2.visibility = View.VISIBLE
            tiviViewModel.getTivishow().observe(viewLifecycleOwner, { tivi ->

                if (tivi != null) {
                    when (tivi.status){
                        Status.LOADING -> binding?.progressBar2?.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            binding.progressBar2.visibility = View.GONE
                            tiviShowAdapter.setTivishow(tivi.data)
                            tiviShowAdapter.notifyDataSetChanged()
                        }
                        Status.ERROR -> {
                            binding?.progressBar2.visibility =View.GONE
                            Toast.makeText(context,"Terjadi kesalahan", Toast.LENGTH_LONG).show()
                        }
                    }
                }

            })

            binding?.rvtivi.layoutManager = GridLayoutManager(requireActivity(), 2)
            binding?.rvtivi.setHasFixedSize(true)
            binding?.rvtivi.adapter = tiviShowAdapter
        }

    }
}
