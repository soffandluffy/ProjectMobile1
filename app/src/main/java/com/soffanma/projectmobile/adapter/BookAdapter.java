package com.soffanma.projectmobile.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.soffanma.projectmobile.BookDetailActivity;
import com.soffanma.projectmobile.R;
import com.soffanma.projectmobile.model.Book;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private ArrayList<Book> listBook;
    private Context context;

    public BookAdapter(ArrayList<Book> list, Context context) {
        this.listBook = list;
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_book, viewGroup, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BookViewHolder holder, int position) {

        Book hero = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.bookImage);
        holder.tvTitle.setText(hero.getName());
        holder.tvAuthor.setText(hero.getAuthor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookDetailActivity.class);
                intent.putExtra("title",  hero.getName());
                intent.putExtra("author",  hero.getAuthor());
                intent.putExtra("photo",  hero.getPhoto());
//                ActivityOptionsCompat options = ActivityOptionsCompat.
//                        makeSceneTransitionAnimation((Activity) context, (View)holder.bookImage, "image");
//                context.startActivity(intent, options.toBundle());
                context.startActivity(intent );
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView bookImage;
        TextView tvTitle, tvAuthor;
        BookViewHolder(View itemView) {
            super(itemView);
            bookImage = itemView.findViewById(R.id.imageView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
        }
    }

}
