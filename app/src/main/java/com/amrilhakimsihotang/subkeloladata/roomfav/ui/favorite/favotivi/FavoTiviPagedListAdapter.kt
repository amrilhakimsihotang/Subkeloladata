package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favotivi

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ListFavtivishowBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie.FavMovieDetailActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FavoTiviPagedListAdapter(private val activity: Activity) :
    PagedListAdapter<TiviFav, FavoTiviPagedListAdapter.FavTiviViewHolder>(DIFF_CALLBACK) {
    companion object {
        private val DIFF_CALLBACK: DiffUtil.ItemCallback<TiviFav> =
            object : DiffUtil.ItemCallback<TiviFav>() {

                override fun areItemsTheSame(oldItem: TiviFav, newItem: TiviFav): Boolean {
                    return oldItem.originalName == oldItem.originalName && oldItem.overview == newItem.overview
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(oldItem: TiviFav, newItem: TiviFav): Boolean {
                    return oldItem == newItem
                }
            }
    }

    inner class FavTiviViewHolder(private val binding: ListFavtivishowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tiviFav: TiviFav) {
            Glide.with(itemView.context)
                .load(tiviFav.posterPath)
                .apply(RequestOptions().override(800, 600))
                .error(R.drawable.ic_baseline_tag_faces_24)
                .into(binding.imgPosterMovies)
            binding.tivifavId.text = itemView.context.getString(R.string.gen_favo_id, tiviFav.id)
            binding.tivifavTitle.text = tiviFav.originalName
            binding.tivifavOverview.text =
                itemView.context.getString(R.string.fav_overview_general, tiviFav.overview)
            binding.tivifavCreator.text =
                itemView.context.getString(R.string.fav_creator_general, tiviFav.creatorCast)
            binding.cvfavotivishow.setOnClickListener {
                val mIntent = Intent(activity, FavTivisDetailActivity::class.java)
                mIntent.putExtra(FavTivisDetailActivity.EXTRA_POSITION, adapterPosition)
                mIntent.putExtra(FavTivisDetailActivity.DETAIL_FAV_TIVI, tiviFav)
                activity.startActivityForResult(mIntent, FavMovieDetailActivity.RESULT_DELETE)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavTiviViewHolder {
        val binding =
            ListFavtivishowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavTiviViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavTiviViewHolder, position: Int) {
        holder.bind(getItem(position) as TiviFav)
    }

}