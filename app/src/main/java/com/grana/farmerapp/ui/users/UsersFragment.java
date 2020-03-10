package com.grana.farmerapp.ui.users;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grana.farmerapp.R;
import com.kirana.avatar.authorization.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UsersFragment extends Fragment {

    private UsersViewModel mViewModel;

    public static UsersFragment newInstance() {
        return new UsersFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_users, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.users_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // this is data fro recycler view

        List<UserDTO> users = new ArrayList<>();
        users.add(UserDTO.builder().firstName("Arun").lastName("123544").build());
        users.add(UserDTO.builder().firstName("Prakash").lastName("123344").build());

        // 3. create an adapter
        UserRecycleViewAdapter mAdapter = new UserRecycleViewAdapter(users);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(UsersViewModel.class);
        // TODO: Use the ViewModel
    }

}
