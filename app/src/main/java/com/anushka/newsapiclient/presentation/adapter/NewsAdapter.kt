package com.anushka.newsapiclient.presentation.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.anushka.newsapiclient.data.model.Article
import com.anushka.newsapiclient.databinding.NewsListItemBinding
import com.bumptech.glide.Glide
class NewsAdapter : PagedListAdapter<Article, NewsAdapter.newViewHolder>(callBacks) {

    val differ = AsyncListDiffer(this, callBacks);

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newViewHolder {
        val binding = NewsListItemBinding.inflate(LayoutInflater.from(parent.context),  parent,false)
        return newViewHolder(binding);
    }
    override fun onBindViewHolder(holder: newViewHolder, position: Int) {
        val article = differ.currentList[position]
        holder.bind(article)
    }
    override fun getItemCount(): Int {
      return differ.currentList.size
    }

    inner class newViewHolder(val binding: NewsListItemBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(article: Article)
        {
            binding.tvTitle.text = article.title
            binding.tvDescription.text = article.description
            binding.tvPublishedAt.text = article.publishedAt
            binding.tvSource.text = article.source!!.name

            Glide.with(binding.ivArticleImage.context)
                .load(article.urlToImage)
                .into(binding.ivArticleImage)


        }
    }

    companion object {
        private val callBacks = object : DiffUtil.ItemCallback<Article>(){
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.url  == newItem.url
            }
            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem  == newItem
            }
        }
    }


}