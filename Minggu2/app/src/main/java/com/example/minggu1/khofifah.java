package com.example.minggu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class khofifah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khofifah);
    }

    public void linear(View view) {
        Intent intent = new Intent(khofifah.this, LinearLayout.class);
        startActivity(intent);
    }
    public void Relative(View view) {
        Intent intent = new Intent(khofifah.this, RelativeLayout.class);
        startActivity(intent);
    }
    public void Constraint(View view) {
        Intent intent = new Intent(khofifah.this, ConstraintLayout.class);
        startActivity(intent);
    }
    public void Frame(View view) {
        Intent intent = new Intent(khofifah.this, FrameLayout.class);
        startActivity(intent);
    }
    public void Table(View view) {
        Intent intent = new Intent(khofifah.this, TabelLayout.class);
        startActivity(intent);
    }
    public void Material(View view) {
        Intent intent = new Intent(khofifah.this, materialdesign.class);
        startActivity(intent);
    }
    public void ScrollV(View view) {
        Intent intent = new Intent(khofifah.this, ScrollViewVertical.class);
        startActivity(intent);
    }
    public void ScrollVH(View view) {
        Intent intent = new Intent(khofifah.this, ScrollViewHorizontal.class);
        startActivity(intent);
    }
}