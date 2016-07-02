package com.umitems.espresso.automatetestingworkshop;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.umitems.espresso.automatetestingworkshop.databinding.ActivityMainBinding;
import com.umitems.espresso.automatetestingworkshop.models.DummyModel;
import com.umitems.espresso.automatetestingworkshop.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter mAdapter;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.myRecyclerView.setHasFixedSize(true);
        binding.myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        initDataSet();
        binding.myRecyclerView.setAdapter(mAdapter);

        binding.tvHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
                intent.putExtra("name",binding.etName.getText().toString());
                startActivity(intent);
            }
        });
        User user = new User("Test", "User");
        binding.setUser(user);
        user.setFirstName("test3");
    }

    private void initDataSet() {
        ArrayList<DummyModel> myDataset=new ArrayList<>();
        for (int i = 0; i < DummyModel.MAX_DUMMY_DATA; i++) {
            myDataset.add(new DummyModel(String.valueOf(i)));
        }
        initAdapter(myDataset);
    }

    private void initAdapter(ArrayList<DummyModel> myDataset) {
        mAdapter = new MyAdapter(myDataset);
    }
}