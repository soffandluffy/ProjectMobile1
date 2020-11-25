package com.soffanma.projectmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.soffanma.projectmobile.model.Book;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class BookDetailActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private TextView tvTitle, tvAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        circleImageView = findViewById(R.id.bookCover);
        tvTitle = findViewById(R.id.tvTitle);
        tvAuthor = findViewById(R.id.tvAuthor);

        Intent intent = getIntent();
        String name = intent.getStringExtra("title");
        String from = intent.getStringExtra("author");
        String photo = intent.getStringExtra("photo");

        Glide.with(getApplicationContext())
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(circleImageView);
        tvTitle.setText(name);
        tvAuthor.setText(from);

    }
}