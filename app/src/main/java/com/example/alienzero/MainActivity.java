package com.example.alienzero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.GifDrawable;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GIF
        GifImageView gifImageView = findViewById(R.id.gifImageView);
        GifDrawable gifDrawable = (GifDrawable) gifImageView.getDrawable();
        gifDrawable.setLoopCount(0);
        gifDrawable.start();

        CardView toDo = findViewById(R.id.CosmicChecklist);

        toDo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, ToDoActivity.class);
                startActivity(intent);
            }
        });

    }
}