package com.akzaki.listapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.akzaki.listapp.model.List_Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        ArrayList<List_Item> item;

        public MyAdapter() {
            item = new ArrayList<>(10);
            item.add(new List_Item(R.drawable.r1,"YAMAHA R1","999cc, 4-Cylinder"));
            item.add(new List_Item(R.drawable.r6,"YAMAHA R6","599cc, 4-Cylinder"));
            item.add(new List_Item(R.drawable.mt09,"YAMAHA MT-09","847cc, 3-Cylinder"));
            item.add(new List_Item(R.drawable.mt07,"YAMAHA MT-07","689cc, 2-Cylinder"));
            item.add(new List_Item(R.drawable.xsr900,"YAMAHA XSR 900","847cc, 3-Cylinder"));
            item.add(new List_Item(R.drawable.xsr700,"YAMAHA XSR 700","689cc, 2-Cylinder"));
            item.add(new List_Item(R.drawable.tracer900,"YAMAHA TRACER 900","847cc, 3-Cylinder"));
            item.add(new List_Item(R.drawable.tenere700,"YAMAHA TENERE 700","689cc, 2-Cylinder"));
            item.add(new List_Item(R.drawable.niken,"YAMAHA NIKEN","847cc, 3-Cylinder"));
            item.add(new List_Item(R.drawable.fjr1300a,"YAMAHA FJR1300A","1,298cc, 4-Cylinder"));
            item.add(new List_Item(R.drawable.super_tenere,"YAMAHA SUPER TENERE","1,199cc, 2-Cylinder"));
        }


        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_box,parent,false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.MainImage.setImageResource(item.get(position).image_id);
            holder.MainText.setText(item.get(position).main_text);
            holder.SubText.setText(item.get(position).sub_text);

        }

        @Override
        public int getItemCount() {
            return item.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView MainImage;
            TextView MainText;
            TextView SubText;
            public MyViewHolder(View itemView){
                super(itemView);
                MainImage = itemView.findViewById(R.id.MainImage);
                MainText = itemView.findViewById(R.id.MainText);
                SubText = itemView.findViewById(R.id.SubText);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        RecyclerView rv = findViewById(R.id.ItemListRc);

        rv.setAdapter(adapter);
        rv.setLayoutManager(lm);
    }
}