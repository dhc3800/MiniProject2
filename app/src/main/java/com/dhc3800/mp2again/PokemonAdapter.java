package com.dhc3800.mp2again;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.MyViewHolder> {
    private ArrayList<Pokemon> pokemonList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView nameView;
        public TextView idView;
        public MyViewHolder(View view) {
            super(view);
            this.imageView = view.findViewById(R.id.imageView);
            this.idView = view.findViewById(R.id.textView);
            this.nameView = view.findViewById(R.id.textView2);
        }

    }

    public PokemonAdapter(ArrayList<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
    @Override
    public PokemonAdapter.MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        //Glide.with(holder.imageView.getContext()).load("http://img.pokemondb.net/artwork/" + pokemon.getName() + ".jpg").into(holder.imageView);
        holder.nameView.setText(pokemon.getName());
        holder.idView.setText(Integer.toString(pokemon.getId()));
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}
