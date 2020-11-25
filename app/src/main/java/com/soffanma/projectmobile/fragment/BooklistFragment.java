package com.soffanma.projectmobile.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soffanma.projectmobile.R;
import com.soffanma.projectmobile.adapter.BookAdapter;
import com.soffanma.projectmobile.model.Book;
import com.soffanma.projectmobile.model.BookData;

import java.util.ArrayList;

public class BooklistFragment extends Fragment {

    private RecyclerView rvBook;
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_booklist, container, false);
        rvBook = view.findViewById(R.id.rvBook);
        rvBook.setHasFixedSize(true);
        books.addAll(BookData.getListData());
        rvBook.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        BookAdapter bookAdapter = new BookAdapter(books, view.getContext());
        rvBook.setAdapter(bookAdapter);
        return view;

    }

}