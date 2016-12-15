package com.example.aqua.movieratings;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by aqua on 12/14/2016.
 */

public class MovieAdapter extends RecyclerView.Adapter {
    Context ctx;

    MovieAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(ctx).inflate(R.layout.row, null, false);
        RowHolder rowHolder = new RowHolder(v);


        return rowHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RowHolder rowHolder=(RowHolder)holder;

        Picasso.with(ctx).load("http://i.imgur.com/DvpvklR.png").into(rowHolder.posteriv);
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    class RowHolder extends RecyclerView.ViewHolder {
        ImageView posteriv;
        TextView titletv;
        TextView yeartv;

        public RowHolder(View itemView) {
            super(itemView);
            posteriv = (ImageView) itemView.findViewById(R.id.posteriv);
            titletv = (TextView) itemView.findViewById(R.id.titletv);
            yeartv = (TextView) itemView.findViewById(R.id.yeartv);

        }
    }
}
