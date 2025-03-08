package com.example.myappmusicconbeo;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myappmusicconbeo.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_home) {
                    // Xử lý khi chọn Home
                } else if (itemId == R.id.nav_playlist) {
                    // Xử lý khi chọn Playlist
                } else if (itemId == R.id.nav_favourite) {
                    // Xử lý khi chọn Favourite
                } else if (itemId == R.id.nav_settings) {
                    // Xử lý khi chọn Settings
                }
                return true;
            }

        });
    }
}
