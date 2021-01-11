package com.amrilhakimsihotang.subkeloladata.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.amrilhakimsihotang.subkeloladata.adapter.MoviesAdapter
import com.amrilhakimsihotang.subkeloladata.databinding.FragmentMovieBinding
import com.amrilhakimsihotang.subkeloladata.viewmodel.MovieViewModel
import com.amrilhakimsihotang.subkeloladata.viewmodel.ViewModelFactory
import com.amrilhakimsihotang.subkeloladata.vo.Status

class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private lateinit var moviesAdapter: MoviesAdapter
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            movieViewModel = ViewModelProvider(requireActivity(), factory)
                    .get(MovieViewModel::class.java)

            moviesAdapter = MoviesAdapter()
            binding.progressBar1.visibility = View.VISIBLE
            movieViewModel.getMovie().observe(viewLifecycleOwner,{ movie ->
                if (movie !== null){
                    when(movie.status){
                        Status.LOADING -> binding?.progressBar1?.visibility =View.VISIBLE
                        Status.SUCCESS ->{
                            binding?.progressBar1?.visibility = View.GONE
                            moviesAdapter.setMovie(movie.data)
                            moviesAdapter.notifyDataSetChanged()
                        }
                        Status.ERROR ->{
                            binding?.progressBar1?.visibility= View.GONE
                            Toast.makeText(context,"Terjadi kesalahan",Toast.LENGTH_LONG).show()
                        }
                    }
                }
            })
            binding?.rvmovies.layoutManager = GridLayoutManager(requireActivity(), 2)
            binding?.rvmovies.setHasFixedSize(true)
            binding?.rvmovies.adapter = moviesAdapter
       }
    }
}