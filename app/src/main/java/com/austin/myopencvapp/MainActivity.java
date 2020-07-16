package com.austin.myopencvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity<x> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] r = getArray3d(2,1);
                Log.d("zencher",""+r[1]);
            }
        });
    }
    int[] getArray3d(int x,int y){
        int[][][]array3d=new int[5][5][5];
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    ;
                    array3d[i][j][k] = i + j + k;
                }
            }
        }return array3d[x][y];
    }
}
