package com.example.tuttifruitti;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView textViewChoice1;
        public TextView textViewChoice2;
        public TextView textViewChoice3;
        public TextView textViewChoice4;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            textViewChoice1 = (TextView) itemView.findViewById(R.id.recyclerChoice1);
            textViewChoice2 = (TextView) itemView.findViewById(R.id.recyclerChoice2);
            textViewChoice3 = (TextView) itemView.findViewById(R.id.recyclerChoice3);
            textViewChoice4 = (TextView) itemView.findViewById(R.id.recyclerChoice4);
        }
    }
}