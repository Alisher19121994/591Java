package com.example.a591java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Main> list;

    public MainAdapter(Context context, ArrayList<Main> list) {
        this.context = context;
        this.list = list;
    }

    private int HEAD = 0;
    private int FEEDS = 1;
    private int STORY = 2;


    @Override
    public int getItemViewType(int position) {
        Main main = list.get(position);

        if (main.isHeaders) {
            return HEAD;
        } else if (main.feeds.size() > 0) {
            return FEEDS;
        }
        return STORY;
    }

    void getADapter(ArrayList<Feeds> feeds, RecyclerView recyclerView) {
        StoryAdapter storyAdapter = new StoryAdapter(context, feeds);
        recyclerView.setAdapter(storyAdapter);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == HEAD) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.head_view, parent, false);
            return new HeadViewHolder(view);

        } else if (viewType == FEEDS) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.story_recyclerview, parent, false);
            return new FeedsViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story, parent, false);
        return new StorysViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Main main = list.get(position);
        if (holder instanceof HeadViewHolder) {
        }
        if (holder instanceof FeedsViewHolder) {
            RecyclerView recyclerView = ((FeedsViewHolder) holder).recyclerView;
            getADapter(main.feeds, recyclerView);

        }
        if (holder instanceof StorysViewHolder) {
            ((StorysViewHolder) holder).profile.setImageResource(main.story.profile);
            ((StorysViewHolder) holder).story_fullImageScreen_id.setImageResource(main.story.story_fullImageScreen_id);
            ((StorysViewHolder) holder).tagged.setText(main.story.taggedComment);
            ((StorysViewHolder) holder).story_Fullname_id.setText(main.story.fullname);
            ((StorysViewHolder) holder).story_comment_1_id.setText(main.story.story_comment_1_id);
            ((StorysViewHolder) holder).story_comment_2_id.setText(main.story.story_comment_2_id);

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HeadViewHolder extends RecyclerView.ViewHolder {
        public HeadViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class FeedsViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;

        public FeedsViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.story_recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        }
    }

    public class StorysViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView profile;
        ImageView story_fullImageScreen_id;
        TextView tagged;
        TextView story_Fullname_id;
        TextView story_comment_1_id;
        TextView story_comment_2_id;

        public StorysViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.story_profile_id);
            tagged = itemView.findViewById(R.id.story_comment_tagged_id);
            story_Fullname_id = itemView.findViewById(R.id.story_Fullname_id);
            story_comment_1_id = itemView.findViewById(R.id.story_comment_1_id);
            story_comment_2_id = itemView.findViewById(R.id.story_comment_2_id);
            story_fullImageScreen_id = itemView.findViewById(R.id.story_fullImageScreen_id);

        }
    }
}
