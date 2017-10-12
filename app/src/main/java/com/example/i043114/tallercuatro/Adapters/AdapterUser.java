package com.example.i043114.tallercuatro.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.i043114.tallercuatro.MainActivity;
import com.example.i043114.tallercuatro.Models.ModelUser;
import com.example.i043114.tallercuatro.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 12/10/17.
 */

public class AdapterUser {
    List<ModelUser> UserList = new ArrayList<>();
    Context context;

    // Constructor de la clase
    public AdapterUser(List<ModelUser> UserList2, Context context) {
        this.UserList = UserList2;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.users_item, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {

        // Encargado de trabajar con el item.xml y sus componentes
        holder.textViewName.setText(UserList.get(position).getName());
        holder.textVid.setText(UserList.get(position).getId());
        holder.textVUsername.setText(UserList.get(position).getAdress());
        holder.textVCompany.setText(UserList.get(position).getCompany());
        holder.textVadress.setText(UserList.get(position).getAdress());
    }

    @Override
    public int getItemCount() {
        return UserList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewName;
        TextView textVid;
        TextView textVUsername;
        TextView textVadress;
        TextView textVCompany;

        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            textVid = (TextView) item.findViewById(R.id.id_item_user);
            textViewName = (TextView) item.findViewById(R.id.name_user);
            textVUsername =(TextView)item.findViewById(R.id.username_user);
            textVadress =(TextView ) item.findViewById(R.id.city_user);
            textVCompany = (TextView) item.findViewById(R.id.name_company_user);
        }

        @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, MainActivity.class);
            contextItem.startActivity(intent);
        }
    }

}
