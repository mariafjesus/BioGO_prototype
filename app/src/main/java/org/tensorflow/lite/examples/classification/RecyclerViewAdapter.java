package org.tensorflow.lite.examples.classification;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Species> speciesList;
    Context context;
    Dialog dialog;

    public RecyclerViewAdapter(List<Species> speciesList, Context context) {
        this.speciesList = speciesList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_species_display, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        dialog = new Dialog(context);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Species_namePt.setText(speciesList.get(position).getNamePortuguese());
        // Add image
        Glide.with(this.context).load(speciesList.get(position).getImageURL()).into(holder.species_image);

        String species_namePt = speciesList.get(position).getNamePortuguese();
        String species_nameLatim = speciesList.get(position).getNameLatim();
        String species_description = speciesList.get(position).getDescription();
        String image_url = speciesList.get(position).getImageURL();

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open dialog box with species info
                dialog.setContentView(R.layout.species_info_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                //Intent intent = new Intent(context, species_info_dialog);
                //context.startActivity(intent);
                final TextView namePt = (TextView) dialog.findViewById(R.id.species_namePt);
                namePt.setText(species_namePt);

                final TextView nameLatim = (TextView) dialog.findViewById(R.id.species_nameLatim);
                nameLatim.setText(species_nameLatim);

                final TextView description = (TextView) dialog.findViewById(R.id.species_description);
                description.setText(species_description);

                ImageView imageView = dialog.findViewById(R.id.species_image);

                Glide.with(context).load(image_url).into(imageView);

                //Glide.with(this.context).load(speciesList.get(position).getImageURL()).into(dialog.species_image);

                //final ImageView image = (ImageView) dialog.findViewById(R.id.species_image);
                //image.setBackgroundResource(image_url);

                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return speciesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        de.hdodenhof.circleimageview.CircleImageView species_image;
        TextView Species_namePt;
        ConstraintLayout parentLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            species_image = itemView.findViewById(R.id.species_image);
            Species_namePt = itemView.findViewById(R.id.Species_namePt);
            parentLayout = itemView.findViewById(R.id.oneSpeciesLayout);
        }
    }
}
