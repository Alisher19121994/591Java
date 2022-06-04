package com.example.a591java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Feeds> list;

    public StoryAdapter(Context context, ArrayList<Feeds> list) {
        this.context = context;
        this.list = list;
    }

    private int CREATE = 0;
    private int FEEDS = 1;

    private boolean isHeader(int position) {
        return position == 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (isHeader(position)) {
            return CREATE;
        }
        return FEEDS;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == CREATE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.create, parent, false);
            return new CreateViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feeds, parent, false);
        return new FeedsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Feeds feeds = list.get(position);
        if (holder instanceof CreateViewHolder) {
        }
        if (holder instanceof FeedsViewHolder) {
            ((FeedsViewHolder) holder).mainPic.setImageResource(feeds.mainPhoto);
            ((FeedsViewHolder) holder).roundedPic.setImageResource(feeds.roundedPhoto);
            ((FeedsViewHolder) holder).text.setText(feeds.text);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CreateViewHolder extends RecyclerView.ViewHolder {
        public CreateViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class FeedsViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView mainPic;
        ShapeableImageView roundedPic;
        TextView text;

        public FeedsViewHolder(@NonNull View itemView) {
            super(itemView);
            mainPic = itemView.findViewById(R.id.feeds_fullImage_id);
            roundedPic = itemView.findViewById(R.id.feeds_roundedImage_id);
            text = itemView.findViewById(R.id.feeds_textFullname_id);

        }
    }
}
