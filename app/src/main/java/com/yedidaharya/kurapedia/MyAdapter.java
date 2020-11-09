package com.yedidaharya.kurapedia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.yedidaharya.kurapedia.ui.DashboardFragment;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<String> titles;
    List<Integer> images;
    LayoutInflater inflater;



    public MyAdapter(Context ctx, List<String> titles, List<Integer> images){
        this.titles = titles;
        this.images = images;
        this.inflater = LayoutInflater.from(ctx);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_grid_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
        holder.gridIcon.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView gridIcon;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            title = itemView.findViewById(R.id.textView2);
            gridIcon = itemView.findViewById(R.id.imageView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()) {
                        case 0:
                            intent = new Intent(context, Kura1.class);
                            break;
                        case 1:
                            intent = new Intent(context, Kura2.class);
                            break;
                        case 2:
                            intent = new Intent(context, Kura3.class);
                            break;
                        case 3:
                            intent = new Intent(context, Kura4.class);
                            break;
                        case 4:
                            intent = new Intent(context, Kura5.class);
                            break;
                        case 5:
                            intent = new Intent(context, Kura6.class);
                            break;
                        case 6:
                            intent = new Intent(context, Kura7.class);
                            break;
                        case 7:
                            intent = new Intent(context, Kura8.class);
                            break;
                        case 8:
                            intent = new Intent(context, Kura9.class);
                            break;
                        case 9:
                            intent = new Intent(context, Kura10.class);
                            break;
                        default:
                            intent =  new Intent(context, MainActivity.class);
                            break;
                    }

                    context.startActivity(intent);


                }


            });
        }

    }
}