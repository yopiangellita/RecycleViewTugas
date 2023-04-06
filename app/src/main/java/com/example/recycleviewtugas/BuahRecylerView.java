package com.example.recycleviewtugas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BuahRecylerView extends RecyclerView.Adapter<BuahRecylerView.ViewHolder> {
    Context context;
    ArrayList<Buah> arrayList= new ArrayList<>();

    public BuahRecylerView(Context context, ArrayList<Buah>arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.imageView.setImageResource(arrayList.get(position).getImage());
    holder.textView.setText(arrayList.get(position).getName());


    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(context, "Buah", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(context,MainActivity2.class);
            intent.putExtra("flag",arrayList.get(position).getImage());
            intent.putExtra("name",arrayList.get(position).getName());
//            intent.putExtra("history",arrayList.get(position).getHistory());
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            cardView = itemView.findViewById(R.id.cardview);
        }


    }
}
