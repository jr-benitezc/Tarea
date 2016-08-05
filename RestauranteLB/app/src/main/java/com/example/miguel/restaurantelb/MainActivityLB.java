package com.example.miguel.restaurantelb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityLB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_lb);
    }
    public void click1(View v){
        Toast.makeText(MainActivityLB.this,"Bocaditos Manabas",Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){
        Toast.makeText(MainActivityLB.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityLB.this,"Ceviche de Pescado",Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityLB.this,"Cangrejada",Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityLB.this,"Encebollado",Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityLB.this,"Encocado de Pescado",Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityLB.this,"Apanado",Toast.LENGTH_SHORT).show();
    }
}
