package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favotivi

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ListTvshowBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.helper.TiviDiffCallback
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FavoTiviAdapter(private val activity: Activity): RecyclerView.Adapter<FavoTiviAdapter.FavTiviViewHolder>() {
    
    private val listFavTivi = ArrayList<TiviFav>()
    
    fun setListFavTivi(listFavTivi: List<TiviFav>) {
        val diffCallbacks = TiviDiffCallback(this.listFavTivi,listFavTivi)
        val diffResult = DiffUtil.calculateDiff(diffCallbacks)
        this.listFavTivi.clear()
        this.listFavTivi.addAll(listFavTivi)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavTiviViewHolder {
        val binding = ListTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavTiviViewHolder(binding)
    }

    inner class FavTiviViewHolder(private val binding: ListTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tiviFav: TiviFav) {
            binding.tvshowTitle.text = tiviFav.originalName
            Glide.with(itemView.context)
                .load(tiviFav.posterPath)
                .apply(RequestOptions().override(800, 600))
                .error(R.drawable.ic_baseline_tag_faces_24)
                .into(binding.imgPosterTvshow)
        }
    }

    override  fun onBindViewHolder(holder: FavTiviViewHolder, position: Int) {
        val favTivi = listFavTivi[position]
        holder.bind(listFavTivi[position])
        holder.itemView.setOnClickListener {
            val movieIntent = TiviFav(
                favTivi.idn,
                favTivi.id,
                favTivi.originalName,
                favTivi.posterPath,
                favTivi.overview,
                favTivi.creatorCast,
            )
            val mIntent = Intent(it.context, FavTivisDetailActivity::class.java)
            mIntent.putExtra(FavTivisDetailActivity.DETAIL_FAV_TIVI, movieIntent)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int = listFavTivi.size
    
/*
    companion object {
        private val DIFF_CALLBACK: DiffUtil.ItemCallback<TiviFav> =  object : DiffUtil.ItemCallback<TiviFav>() {

            override fun areItemsTheSame(oldItem:TiviFav, newItem: TiviFav): Boolean {
                return oldItem.id == oldItem.id && oldItem.originalName == newItem.originalName
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem:TiviFav, newItem: TiviFav): Boolean {
                return oldItem == newItem
            }
        }
    }

    private val listFavTivi = ArrayList<TiviFav>()
    fun setFavTivi(favTivi: List<TiviFav>) {
        this.listFavTivi.clear()
        this.listFavTivi.addAll(favTivi)
        this.notifyDataSetChanged()
    }


    inner class FavTiviViewHolder(private val binding: ListTvshowBinding) :
            RecyclerView.ViewHolder(binding.root) {
        fun bind(tiviFav: TiviFav) {
            binding.tvshowTitle.text = tiviFav.originalName
            Glide.with(itemView.context)
                    .load(tiviFav.posterPath)
                    .apply(RequestOptions().override(800, 600))
                    .error(R.drawable.ic_baseline_tag_faces_24)
                    .into(binding.imgPosterTvshow)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavTiviViewHolder {
        val binding = ListTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavTiviViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavTiviViewHolder, position: Int) {
        val favTivi = listFavTivi[position]
        holder.bind(listFavTivi[position])
        holder.itemView.setOnClickListener {
            val movieIntent = TiviFav(
                    favTivi.idn,
                    favTivi.id,
                    favTivi.originalName,
                    favTivi.posterPath,
                    favTivi.overview,
                    favTivi.creatorCast,
                    )
            val mIntent = Intent(it.context, FavTivisDetailActivity::class.java)
            mIntent.putExtra(FavTivisDetailActivity.DETAIL_FAV_TIVI, movieIntent)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int = listFavTivi.size*/
}