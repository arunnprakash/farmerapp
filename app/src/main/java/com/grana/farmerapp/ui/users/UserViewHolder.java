package com.grana.farmerapp.ui.users;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.grana.farmerapp.R;

public class UserViewHolder extends RecyclerView.ViewHolder {

        public TextView txtFirstName;
        public TextView txtLastName;

        public UserViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtFirstName = (TextView) itemLayoutView.findViewById(R.id.firtName);
            txtLastName = (TextView) itemLayoutView.findViewById(R.id.lastName);
        }
}