package com.amrilhakimsihotang.subkeloladata.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.databinding.ListTvshowBinding
import com.amrilhakimsihotang.subkeloladata.detail.DetailTvshowActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TiviShowAdapter : PagedListAdapter<TiviEntity, TiviShowAdapter.TiviShowViewHolder>(DIFF_CALLBACK) {

    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TiviEntity>() {
            override fun areItemsTheSame(oldItem: TiviEntity, newItem: TiviEntity): Boolean {
                return oldItem.id == newItem.id
            }
            override fun areContentsTheSame(oldItem: TiviEntity, newItem: TiviEntity): Boolean {
                return oldItem == newItem
            }
        }
    }


    private val listiviShow = ArrayList<TiviEntity>()
    fun setTivishow(tivi: List<TiviEntity>?) {
        if (tivi == null) return
        this.listiviShow.clear()
        this.listiviShow.addAll(tivi)
        this.notifyDataSetChanged()

    }

    class TiviShowViewHolder(private val binding: ListTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tiviEntity: TiviEntity) {
            binding.tvshowTitle.text = tiviEntity.originalName
            Glide.with(itemView.context)
                .load(tiviEntity.posterPath)
                .apply(RequestOptions().override(800, 600))
                .error(R.drawable.ic_baseline_tag_faces_24)
                .into(binding.imgPosterTvshow)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiviShowViewHolder {
        val binding = ListTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TiviShowViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TiviShowViewHolder, position: Int) {
        val tivi = listiviShow[position]
        holder.bind(listiviShow[position])
        holder.itemView.setOnClickListener {

            val id: String = tivi.id
            val originalName: String = tivi.originalName
            val posterPath: String = tivi.posterPath
            val overview: String = tivi.overview
            val creatorCast: String= tivi.creatorCast
            val seriesCast: String=tivi.seriesCast
            val writingCast: String=tivi.writingCast

            val mIntent = Intent(it.context, DetailTvshowActivity::class.java)
            mIntent.putExtra("id",id)
            mIntent.putExtra("originalName",originalName)
            mIntent.putExtra("posterPath", posterPath)
            mIntent.putExtra("overview", overview)
            mIntent.putExtra("creatorCast", creatorCast)
            mIntent.putExtra("seriesCast", seriesCast)
            mIntent.putExtra("writingCast", writingCast)
            it.context.startActivity(mIntent)
        }

    }

    override fun getItemCount(): Int = listiviShow.size
}