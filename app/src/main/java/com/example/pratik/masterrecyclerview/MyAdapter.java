package com.example.pratik.masterrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private static final String TAG = "MyAdapter";
    private List<Items> itemsList;
    public Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: is called");
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_list,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: is called");
        Items items = itemsList.get(position);
        holder.information.setText(items.getmInfo());
        holder.topic.setText(items.getmTopic());
        holder.done.setImageResource(items.getmImage());


    }
    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageButton done;
        TextView topic,information;
       RecyclerView mRecyclerView;
       ConstraintLayout constraintLayout;


        public MyViewHolder(View itemView) {
          

            super(itemView);
            Log.d(TAG, "MyViewHolder: is called");
            done = itemView.findViewById(R.id.imageButton);
            topic = itemView.findViewById(R.id.textView_topic);
            information = itemView.findViewById(R.id.textView_info);
          itemView.setOnClickListener(new View.OnClickListener() {
              @Override

              public void onClick(View v) {
                  Intent intent = new Intent(context,DetailActivity.class);
                  context.startActivity(intent);
               //   Toast.makeText(context, "Layout Position"+getLayoutPosition()+getItemViewType()+getOldPosition()+getItemId()+getAdapterPosition(), Toast.LENGTH_LONG).show();
                  Toast.makeText(context, "Is clicked at position "+getLayoutPosition(), Toast.LENGTH_SHORT).show();
                     Log.d(TAG, "onClick:   "+ getAdapterPosition() + "   " + getItemId() + "   " + getOldPosition() + "   " + getItemViewType() + "   " + getItemCount() + "   " + getLayoutPosition());
             }
          });

          done.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Log.d(TAG, "onClick: for done "+"  "+getAdapterPosition()+"   "+getItemId()+"   "+getOldPosition()+"   "+getItemViewType()+"   "+getItemCount()+"   "+getLayoutPosition());
                  Toast.makeText(context, "Done is clicked at position "+getLayoutPosition(), Toast.LENGTH_SHORT).show();
              }

          });

        }
    }
    public MyAdapter(List<Items> itemsList,Context context){
        Log.d(TAG, "MyAdapter: is called");
        this.itemsList = itemsList;
        this.context = context;

    }
}
