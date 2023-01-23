package com.rkbapps.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModelClass>modelClassList = new ArrayList<>();
    MyAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerView);
        adapter =new MyAdapter(modelClassList);

        modelClassList.add(new ModelClass("Ruhi","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1630539625531-13d781ebb4ee?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=327&q=80"));
        modelClassList.add(new ModelClass("Rupa","Hello how are you?","11:45 am","https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Sayani","Hello how are you?","10:45 pm","https://images.unsplash.com/photo-1619286188088-de820bdc1230?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Salini","Hello how are you?","02:45 am","https://images.unsplash.com/photo-1623060386759-6e1016735859?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Sujata","Hello how are you?","12:30 am","https://images.unsplash.com/photo-1626193081943-7edeae05ef83?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjF8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Rinki","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1512310604669-443f26c35f52?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjN8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Rupali","Hello how are you?","10:44 pm","https://images.unsplash.com/photo-1631005436600-15dd6ddabf92?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzZ8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Mousumi","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1535704882196-765e5fc62a53?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDh8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Moumita","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1623671205243-588a9e7d5412?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTJ8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Priti","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1583397758920-86c1cb75b8fe?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nzh8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Jayashree","Hello how are you?","10:45 am","https://images.unsplash.com/flagged/photo-1580141043903-ef7df571364b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTB8fGluZGlhbiUyMGdpcmx8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Ishita","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1524502397800-2eeaad7c3fe5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTIwfHxpbmRpYW4lMjBnaXJsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Diha","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1509839862600-309617c3201e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTI2fHxpbmRpYW4lMjBnaXJsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Susmita","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1583807543495-625f6c9e84db?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjEwfHxpbmRpYW4lMjBnaXJsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        modelClassList.add(new ModelClass("Sutanika","Hello how are you?","10:45 am","https://images.unsplash.com/photo-1601298814294-9818385ae8bc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjE4fHxpbmRpYW4lMjBnaXJsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}