package com.example.kuylomba.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuylomba.R;
import com.example.kuylomba.model.Contest;

import java.util.ArrayList;

public class ContestListAdapter extends RecyclerView.Adapter<ContestListAdapter.ListViewHolder> {
    private ArrayList<Contest> contests;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ContestListAdapter(ArrayList<Contest> contests) {
        this.contests = contests;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Contest contest = contests.get(position);
        holder.thumbnail.setImageResource(contest.getThumbnail());
        holder.name.setText(contest.getName());
        holder.category.setText(contest.getCategory());
        holder.star.setRating(contest.getStar());
        holder.entryFee.setText("$" + contest.getEntryFee());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(contests.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return contests.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView name, category, entryFee;
        RatingBar star;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnail = itemView.findViewById(R.id.thumbnail);
            name = itemView.findViewById(R.id.name);
            category= itemView.findViewById(R.id.category);
            star = itemView.findViewById(R.id.star);
            entryFee = itemView.findViewById(R.id.entryFee);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Contest data);
    }
}
