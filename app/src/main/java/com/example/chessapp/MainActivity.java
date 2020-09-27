package com.example.chessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createTable(8,8);
    }
    protected void createTable (int row, int col)
    {
        TableLayout Table = findViewById(R.id.gameTable);
        for (int i=0; i<row; i++) {
            TableRow tr = new TableRow(this);

            for (int j = 0; j < col; j++) {
                Button btn = new Button(this);
                btn.setText("asd");
                tr.addView(btn);
            }
            Table.addView(tr);
        }

    }
}