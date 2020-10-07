package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class adaptersport extends RecyclerView.Adapter<adaptersport.holder> {
    List<Article> articlelist;

    public adaptersport(List<Article> articlelist) {
        this.articlelist = articlelist;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Article article=articlelist.get(position);
        holder.description.setText(article.getDescription());
        holder.title.setText(article.getTitle());
        Picasso.get().load(article.getUrlToImage()).into(holder.imgNews);



    }

    @Override
    public int getItemCount() {
        return articlelist.size();
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView title,description;
        ImageView imgNews;
        public holder(@NonNull View itemView) {
            super(itemView);
            imgNews=itemView.findViewById(R.id.img_news);

            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);

        }
    }
}
