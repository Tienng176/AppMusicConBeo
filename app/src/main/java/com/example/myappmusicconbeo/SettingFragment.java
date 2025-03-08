package com.example.myappmusicconbeo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SettingFragment extends Fragment {
    private RecyclerView recyclerView;
    private SettingsAdapter adapter;
    private List<SettingItem> settingsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewSettings);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        settingsList = new ArrayList<>();
        settingsList.add(new SettingItem("Dark Mode", "Bật/tắt chế độ tối", SettingType.SWITCH));
        settingsList.add(new SettingItem("Tự động phát nhạc", "Phát nhạc ngay khi kết nối", SettingType.SWITCH));
        settingsList.add(new SettingItem("Chính sách bảo mật", "Xem điều khoản sử dụng", SettingType.NAVIGATION));

        adapter = new SettingsAdapter(settingsList, getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
