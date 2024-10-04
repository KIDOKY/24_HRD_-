package com.example.digitclassifier;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.divyanshu.draw.widget.DrawView;

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        DrawView drawView = findViewById(R.id.drawView);
        drawView.setStrokeWidth(100.0f);
        drawView.setBackgroundColor(Color.BLACK);
        drawView.setColor(Color.WHITE);

        Button classifyBtn = findViewById(R.id.classifyBtn);
        classifyBtn.setOnClickListener(v -> {
            Bitmap image = drawView.getBitmap();
        });
        Button clearBtn = findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(v -> {
            drawView.clearCanvas();
        });
    }
}