package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favotivi

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ActivityListFavTiviBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.helper.ViewModelFactory
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.FavoriteTiviViewModel
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.MovietiviAddDelViewModel

class ListFavTiviActivity : AppCompatActivity() {
    companion object {
        const val ALERT_DIALOG_DELETE = 20
        const val ALERT_DIALOG_CLOSE = 10
    }
    private lateinit var movietiviAddDelViewModel: MovietiviAddDelViewModel
    private var _binding: ActivityListFavTiviBinding?=null
    private val binding get() = _binding
    private lateinit var adapter: FavoTiviPagedListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_fav_tivi)
        _binding= ActivityListFavTiviBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        supportActionBar?.title = resources.getString(R.string.detailfavtivi)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

      val favoriteTiviViewModel = obtainViewModel(this@ListFavTiviActivity)
        favoriteTiviViewModel.getAllTiviFav().observe(this,tiviFavObserver)
        movietiviAddDelViewModel = MovietiviAddDelViewModel(application)
        adapter= FavoTiviPagedListAdapter(this@ListFavTiviActivity)

        binding?.rcfavlisttive?.layoutManager= LinearLayoutManager(applicationContext)
        binding?.rcfavlisttive?.setHasFixedSize(true)
        binding?.rcfavlisttive?.adapter=adapter

        binding?.fabDelfavtivi?.setOnClickListener { view ->
            if(view.id==R.id.fab_delfavtivi){
                showAlertDialog(ALERT_DIALOG_DELETE)
            }
        }
    }

    private val tiviFavObserver = Observer<PagedList<TiviFav>> { tiviList ->
        if(tiviList != null){
            adapter.submitList(tiviList)
        }
    }


    private fun obtainViewModel(activity: AppCompatActivity): FavoriteTiviViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory).get(FavoriteTiviViewModel::class.java)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
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
                    movietiviAddDelViewModel.delAllTiviFav()
                }
                finish()
            }
            setNegativeButton(getString(R.string.no)) { dialog, _ -> dialog.cancel() }
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

}