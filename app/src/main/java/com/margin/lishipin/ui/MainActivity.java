package com.margin.lishipin.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.margin.lishipin.R;
import com.margin.lishipin.ui.adapter.MainAdapter;
import com.margin.lishipin.ui.view.NoSlidingViewPaper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.main_container)
    NoSlidingViewPaper mainContainer;
    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews() {
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        mainContainer.setCurrentItem(0, true);
                        break;
                    case R.id.navigation_live_video:
                        mainContainer.setCurrentItem(1, true);
                        break;

                    case R.id.navigation_subscribe:
                        mainContainer.setCurrentItem(2, true);
                        break;

                    case R.id.navigation_paike:
                        mainContainer.setCurrentItem(3, true);
                        break;

                    case R.id.navigation_my:
                        mainContainer.setCurrentItem(4, true);
                        break;

                }
                return true;
            }
        });
        mainContainer.setAdapter(new MainAdapter(getSupportFragmentManager()));
    }

}
