package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityListFavMovieBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.helper.ViewModelFactory
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.FavoriteMovieViewModel
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.MovietiviAddDelViewModel

class ListFavMovieActivity : AppCompatActivity() {

    companion object{
        const val ALERT_DIALOG_DELETE = 20
        const val ALERT_DIALOG_CLOSE = 10
    }

    private var _binding: ActivityListFavMovieBinding? = null
    private val binding get() = _binding
    private lateinit var adapter: FavoMoviePagedListAdapter
    private lateinit var movietiviAddDelViewModel: MovietiviAddDelViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityListFavMovieBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        supportActionBar?.title = resources.getString(R.string.detailfavmovie)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val favoriteMovieViewModel = obtainViewModel(this@ListFavMovieActivity)
        favoriteMovieViewModel.getAllMovieFav().observe(this, movieFavObserver)
        movietiviAddDelViewModel = MovietiviAddDelViewModel(application)

        adapter = FavoMoviePagedListAdapter(this@ListFavMovieActivity)

        binding?.rcfavlistmovie?.layoutManager = LinearLayoutManager(applicationContext)
        binding?.rcfavlistmovie?.setHasFixedSize(true)
        binding?.rcfavlistmovie?.adapter = adapter

        binding?.fabDelfavmovie?.setOnClickListener { view ->
            if (view.id == R.id.fab_delfavmovie) {
                showAlertDialog(ALERT_DIALOG_DELETE)
            }
        }

    }

    private fun showAlertDialog(type: Int) {
        val isDialogClose = type == ALERT_DIALOG_CLOSE
        val dialogTitle: String
        val dialogMessage: String
        if (isDialogClose) {
            dialogTitle = getString(R.string.cancel)
            dialogMessage = getString(R.string.message_cancel)
        } else {
            dialogMessage = getString(R.string.message_delete)
            dialogTitle = getString(R.string.delete)
        }

        val alertDialogBuilder = AlertDialog.Builder(this)
        with(alertDialogBuilder) {
            setTitle(dialogTitle)
            setMessage(dialogMessage)
            setCancelable(false)
            setPositiveButton(getString(R.string.yes)) { _, _ ->
                if (!isDialogClose) {
                    movietiviAddDelViewModel.delAllMovieFav()
                }
                finish()
            }
            setNegativeButton(getString(R.string.no)) { dialog, _ -> dialog.cancel() }
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }


    private fun obtainViewModel(activity: AppCompatActivity): FavoriteMovieViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory)[FavoriteMovieViewModel::class.java]
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private val movieFavObserver = Observer<PagedList<MovieFav>> { movieList ->
        if (movieList != null) {
            adapter.submitList(movieList)
        }
    }

}