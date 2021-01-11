package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favotivi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityFavTivisDetailBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FavTivisDetailActivity : AppCompatActivity() {
    companion object {
        const val DETAIL_FAV_TIVI = "detail_fav_tivi"
        const val EXTRA_POSITION = "extra_position"
    }

    private lateinit var binding: ActivityFavTivisDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavTivisDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = resources.getString(R.string.detailfavtivi)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tiviFav = intent.getParcelableExtra<TiviFav>(DETAIL_FAV_TIVI) as TiviFav
        Glide.with(this)
            .load(tiviFav.posterPath)
            .apply(RequestOptions().override(800, 600))
            .error(R.drawable.ic_baseline_tag_faces_24)
            .into(binding.favpostertv)
        binding.favdettitletv.text = tiviFav.originalName
        binding.overviewfav.text = tiviFav.overview
        binding.favcreatortv.text = tiviFav.creatorCast

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}