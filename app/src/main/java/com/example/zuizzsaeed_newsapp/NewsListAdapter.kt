package com.example.zuizzsaeed_newsapp
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.zuizzsaeed_newsapp.Article
import com.example.zuizzsaeed_newsapp.databinding.ListItemBinding

class ArticleHolder(
    private val binding: ListItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(article: Article) {
        binding.newsTitle.text = article.title
        binding.newsDate.text = article.publishedAt

        binding.root.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "${article.title} clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
class NewsListAdapter(
    private var articles: List<Article>,
    private val onArticleClicked: (Article) -> Unit
) : RecyclerView.Adapter<ArticleHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ArticleHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        val article = articles[position]
        holder.bind(article)
        holder.itemView.setOnClickListener { onArticleClicked(article) }
    }

    fun updateArticles(newArticles: List<Article>) {
        this.articles = newArticles
        notifyDataSetChanged()
    }

    override fun getItemCount() = articles.size
}

class ArticleDiffCallback : DiffUtil.ItemCallback<Article>() {
    override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem.title == newItem.title && oldItem.description == newItem.description
    }
}
