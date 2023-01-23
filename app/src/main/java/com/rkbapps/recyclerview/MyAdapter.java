package com.rkbapps.recyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<ModelClass> modelClassList = new ArrayList<>();

    public MyAdapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtName.setText(modelClassList.get(position).getName());
        holder.txtMsg.setText(modelClassList.get(position).getMassage());
        holder.txtTime.setText(modelClassList.get(position).getTime());
        Picasso.get().load(modelClassList.get(position).getImageUrl()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Name : "+modelClassList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtMsg, txtTime;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            txtName = itemView.findViewById(R.id.txtName);
            txtMsg = itemView.findViewById(R.id.txtMsg);
            txtTime = itemView.findViewById(R.id.txtTime);
        }
    }
}
