package com.grana.farmerapp.ui.users;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.grana.farmerapp.R;
import com.grana.farmerapp.model.authorization.UserDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserRecycleViewAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private List<UserDTO> userList;

    public UserRecycleViewAdapter() {
        this.userList = new ArrayList<>();
        this.userList.add(UserDTO.builder().firstName("Arun").lastName("Name1").build());
        this.userList.add(UserDTO.builder().firstName("Prakash").lastName("Name2").build());
    }

    // Create new views (invoked by the layout manager)
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View listItemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_layout, null);

        // create ViewHolder
        UserViewHolder viewHolder = new UserViewHolder(listItemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(UserViewHolder viewHolder, int position) {
        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData
        viewHolder.txtFirstName.setText(userList.get(position).getFirstName());
        viewHolder.txtLastName.setText(userList.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public void setData(Collection<UserDTO> userList) {
        this.userList.addAll(userList);
        notifyDataSetChanged();
    }
}