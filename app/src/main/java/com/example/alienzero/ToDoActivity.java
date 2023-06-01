package com.example.alienzero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.alienzero.Adapter.ToDoAdapter;
import com.example.alienzero.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class ToDoActivity extends AppCompatActivity
{
    private RecyclerView tasksRecyclerView;
    private ToDoAdapter taskAdapter;
    private List<ToDoModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().hide();

        taskList = new ArrayList<>();

        tasksRecyclerView = findViewById(R.id.taskRecyclerView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter = new ToDoAdapter(this);
        tasksRecyclerView.setAdapter(taskAdapter);

        ToDoModel task = new ToDoModel();
        task.setTask("This is a test");
        task.setStatus(0);
        task.setId(1);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);

        taskAdapter.setTasks(taskList);


    }
}

