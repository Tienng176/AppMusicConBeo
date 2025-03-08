package com.example.myappmusicconbeo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.ViewHolder> {
    private List<SettingItem> items;
    private Context context;

    public SettingsAdapter(List<SettingItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        SwitchCompat switchCompat;
        ImageView arrow;

        public ViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.settingTitle);
            description = view.findViewById(R.id.settingDescription);
            switchCompat = view.findViewById(R.id.settingSwitch);
            arrow = view.findViewById(R.id.settingArrow);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_setting, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SettingItem item = items.get(position);
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());

        if (item.getType() == SettingType.SWITCH) {
            holder.switchCompat.setVisibility(View.VISIBLE);
            holder.arrow.setVisibility(View.GONE);
        } else {
            holder.switchCompat.setVisibility(View.GONE);
            holder.arrow.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
