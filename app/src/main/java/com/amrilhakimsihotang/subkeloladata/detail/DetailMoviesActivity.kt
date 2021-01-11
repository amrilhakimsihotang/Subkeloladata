

package com.amrilhakimsihotang.subkeloladata.detail

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityDetailMoviesBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.MovietiviAddDelViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailMoviesActivity : AppCompatActivity() {
    companion object {
        const val DETAIL_MOVIES = "detail_movies"
    }

    private var menu : Menu?= null
    private lateinit var detailMoviesBinding: ActivityDetailMoviesBinding
    private lateinit var movietiviAddDelViewModel: MovietiviAddDelViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movies)
        supportActionBar?.title = resources.getString(R.string.detailmovie)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        movietiviAddDelViewModel = MovietiviAddDelViewModel(application)
        detailMoviesBinding = ActivityDetailMoviesBinding.inflate(layoutInflater)
        setContentView(detailMoviesBinding.root)


        val mIntent = intent
        val originalTitle = mIntent.getStringExtra("originalTitle")
        val posterPath = mIntent.getStringExtra("posterPath")
        val overview = mIntent.getStringExtra("overview")
        val director = mIntent.getStringExtra("director")
        val writer = mIntent.getStringExtra("writer")
        val screenplay = mIntent.getStringExtra("screenplay")
        val personCast = mIntent.getStringExtra("personCast")


        Glide.with(this)
                .load(posterPath)
                .apply(RequestOptions().override(800, 600))
                .error(R.drawable.ic_baseline_tag_faces_24)
                .into(detailMoviesBinding.detpostermovies)

        detailMoviesBinding.dettitlemovies.text = originalTitle
        detailMoviesBinding.detoverviewmovies.text = overview
        detailMoviesBinding.detdirector.text =director
        detailMoviesBinding.detwriter.text = writer
        detailMoviesBinding.detscreenplay.text =screenplay
        detailMoviesBinding.detpersoncasting.text = personCast

        detailMoviesBinding.fabshare.setOnClickListener {
            val sMessage: String =
                    resources.getString(R.string.sharedetail) + " " + detailMoviesBinding.dettitlemovies.text.toString() + " " + resources.getString(
                            R.string.sharedetail2
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
        val originalTitle= detailMoviesBinding.dettitlemovies.text.toString()
        val posterPath = tempIntent.getStringExtra("posterPath").toString()
        val overview =detailMoviesBinding.detoverviewmovies.text.toString()
        val director = detailMoviesBinding.detdirector.text.toString()
        val movieFav = MovieFav(0,id,originalTitle,posterPath,overview,director)
        movietiviAddDelViewModel.insert(movieFav)
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
