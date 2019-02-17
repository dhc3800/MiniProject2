package com.dhc3800.mp2again;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.MyViewHolder> {
    private ArrayList<Pokemon> pokemonList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView pokemonView;
        public TextView nameView;
        public TextView idView;
        public MyViewHolder(View view) {
            super(view);
            this.pokemonView = view.findViewById(R.id.imageView);
            this.idView = view.findViewById(R.id.textView);
            this.nameView = view.findViewById(R.id.textView2);

        }

    }

    public DisplayAdapter(ArrayList<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @Override
    public DisplayAdapter.MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list, parent, false);
        DisplayAdapter.MyViewHolder vh = new DisplayAdapter.MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(DisplayAdapter.MyViewHolder holder, final int position) {
        final Pokemon pokemon = pokemonList.get(position);
        holder.nameView.setText(pokemon.getName());
        holder.idView.setText(Integer.toString(pokemon.getId()));
        Glide.with(holder.pokemonView.getContext()).load("http://img.pokemondb.net/artwork/" + pokemon.getName().toLowerCase() + ".jpg").centerCrop().into(holder.pokemonView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Profile.class);
                intent.putExtra("name" , pokemon.getName());
                intent.putExtra("id", pokemon.getId());
                intent.putExtra("attack", pokemon.getAttack());
                intent.putExtra("defense", pokemon.getDefense());
                intent.putExtra("hp", pokemon.getHP());
                intent.putExtra("types", pokemon.getTypes());
                intent.putExtra("spatk", pokemon.getSpatk());
                intent.putExtra("spdef", pokemon.getSpdef());
                intent.putExtra("speed", pokemon.getSpeed());
                intent.putExtra("total", pokemon.getTotal());
                intent.putExtra("flavortext", pokemon.getFlavorText());
                intent.putExtra("species", pokemon.getSpecies());
                v.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}

