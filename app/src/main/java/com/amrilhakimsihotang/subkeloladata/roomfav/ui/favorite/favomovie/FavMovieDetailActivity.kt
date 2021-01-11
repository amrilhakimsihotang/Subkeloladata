package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityFavMovieDetailBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FavMovieDetailActivity : AppCompatActivity() {
    companion object {
        const val DETAIL_FAV_MOVIES = "detail_fav_movies"
        const val EXTRA_POSITION = "extra_position"
        const val RESULT_DELETE = 301
    }

    private lateinit var binding: ActivityFavMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = resources.getString(R.string.detailfavmovie)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val moviefav = intent.getParcelableExtra<MovieFav>(DETAIL_FAV_MOVIES) as MovieFav
        Glide.with(this)
            .load(moviefav.posterPath)
            .apply(RequestOptions().override(800, 600))
            .error(R.drawable.ic_baseline_tag_faces_24)
            .into(binding.detpostermovies)

        binding.favdettitlemovies.text =  moviefav.originalTitle
        binding.favdetoverviewmovies.text = moviefav.overview
        binding.favdirectormovie.text = moviefav.director

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}