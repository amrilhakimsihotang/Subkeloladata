package com.amrilhakimsihotang.subkeloladata.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityHomeBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie.ListFavMovieActivity
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favotivi.ListFavTiviActivity
import com.amrilhakimsihotang.subkeloladata.ui.main.SectionPagerAdapter


class HomeActivity : AppCompatActivity() {

    private lateinit var activityHomeBinding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
        val toolbar: Toolbar = activityHomeBinding.toolbar
        setSupportActionBar(toolbar)
        viewPagerAll()


        activityHomeBinding.fab.setOnClickListener {
            val eBody: String = resources.getString(R.string.body)
            val eSubject: String = resources.getString(R.string.subject)
            val eAddress: String = resources.getString(R.string.email)
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:" + eAddress)
                putExtra(Intent.EXTRA_SUBJECT, eSubject)
                putExtra(Intent.EXTRA_TEXT, eBody)
            }
            startActivity(Intent.createChooser(emailIntent, R.string.title.toString()))
        }

    }

    private fun viewPagerAll() {

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewpager.adapter = sectionPagerAdapter
        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewpager)
        supportActionBar?.elevation = 0f

    }
    private fun showDialogAbout() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title_about)
        builder.setMessage(R.string.content_about)
        builder.setPositiveButton("OK", { _,_ ->})
        builder.show()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.change_language -> {
                val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
                startActivity(mIntent)
            }
            R.id.btnfavmovie ->{
                val mIntent = Intent(this, ListFavMovieActivity::class.java)
                startActivity(mIntent)
            }

            R.id.btnfavotivi ->{
                val mIntent = Intent(this, ListFavTiviActivity::class.java)
                startActivity(mIntent)

            }
            R.id.btn_about ->{
                showDialogAbout()

            }
        }
    }
}

