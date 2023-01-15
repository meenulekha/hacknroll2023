package com.example.lovet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);
        Button backButton2 = findViewById(R.id.backbuttonR);
        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
    public void buttonClicked(View view){
        FirebaseDatabase database = FirebaseDatabase.getInstance("https://lovet-c7981-default-rtdb.asia-southeast1.firebasedatabase.app/");


        //myRef.setValue("Hello");
        EditText editTextTitle = (EditText) findViewById(R.id.title);
        EditText editTextReview = (EditText) findViewById(R.id.enterReview);

        // DatabaseReference myRef = database.getReference("Reviews");
        DatabaseReference node = database.getReference();

        String Title = editTextTitle.getText().toString();
        String Review = editTextReview.getText().toString();
        data_holder obj = new data_holder(Title, Review);


        node.child(Title).setValue(obj);
        editTextTitle.setText("");
        editTextReview.setText("");

        Toast.makeText(getApplicationContext(),"Data Added", Toast.LENGTH_SHORT).show();



    }



}

