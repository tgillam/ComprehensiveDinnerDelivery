package com.example.comprehensivedinnerdelivery;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private View v;

    private MyCustomPagerAdapter myCustomPagerAdapter;
    //TODO: Make dynamic and not hard coded
    private String[] images = {"PIZZA", "ASIAN", "FAST FOOD"};
    private String[] strings = {"pizza", "asian", "fast-food"};
    private List<Restaurant> restaurantList = new ArrayList<>();
    private RestaurantAdapter adapter;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView myrecyclerview = findViewById(R.id.rvNews);
        Context a = MainActivity.this;
        adapter = new RestaurantAdapter(a, restaurantList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a, LinearLayoutManager.VERTICAL, false);
        myrecyclerview.setLayoutManager(linearLayoutManager);
        myrecyclerview.setAdapter(adapter);
    }

}
