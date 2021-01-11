package com.amrilhakimsihotang.subkeloladata.detail

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityDetailTvshowBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.MovietiviAddDelViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailTvshowActivity : AppCompatActivity() {
    companion object {
        const val DETAIL_TIVISHOW = "detail_tivishow"
    }

    private var menu : Menu?= null
    private lateinit var detailTvshowBinding: ActivityDetailTvshowBinding
    private lateinit var movietiviAddDelViewModel: MovietiviAddDelViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tvshow)
        detailTvshowBinding = ActivityDetailTvshowBinding.inflate(layoutInflater)
        setContentView(detailTvshowBinding.root)
        supportActionBar?.title = resources.getString(R.string.detailtivishow)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        movietiviAddDelViewModel = MovietiviAddDelViewModel(application)

        var mIntent = intent
        val originalName = mIntent.getStringExtra("originalName")
        val posterPath = mIntent.getStringExtra("posterPath")
        val overview = mIntent.getStringExtra("overview")
        val creatorCast = mIntent.getStringExtra("creatorCast")
        val seriesCast = mIntent.getStringExtra("seriesCast")
        val writingCast = mIntent.getStringExtra("writingCast")

        Glide.with(this)
            .load(posterPath)
            .apply(RequestOptions().override(800, 600))
            .error(R.drawable.ic_baseline_tag_faces_24)
            .into(detailTvshowBinding.detpostertv)

        detailTvshowBinding.dettitletv.text = originalName
        detailTvshowBinding.detoverviewtv.text = overview
        detailTvshowBinding.detcreator.text =creatorCast
        detailTvshowBinding.detwriter.text =writingCast
        detailTvshowBinding.detseriescast.text = seriesCast

        detailTvshowBinding.fabtivi.setOnClickListener {
            val sMessage: String =
                resources.getString(R.string.sharedetailtv) + " " + detailTvshowBinding.dettitletv.text.toString() + " " + resources.getString(
                    R.string.sharedetailtv2
                )
            val mIntent = Intent(Intent.ACTION_SEND)
            mIntent.type = "text/plain"
            mIntent.putExtra(Intent.EXTRA_TEXT, sMessage)
            startActivity(Intent.createChooser(mIntent, "Share to: "))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu2, menu)
        this.menu
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun insertFavorite(){
        val tempIntent = intent
        val id= tempIntent.getStringExtra("id").toString()
        val originalName= detailTvshowBinding.dettitletv.text.toString()
        val posterPath = tempIntent.getStringExtra("posterPath").toString()
        val overview =detailTvshowBinding.detoverviewtv.text.toString()
        val creator = detailTvshowBinding.detcreator.text.toString()

        val tiviFav = TiviFav(0,id,originalName,posterPath,overview,creator)
        movietiviAddDelViewModel.insert(tiviFav)
        Toast.makeText(this, R.string.alert_success_add, Toast.LENGTH_SHORT)
            .show()
    }
    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.addfavomovie -> {
             insertFavorite()
            }
        }
    }

}
