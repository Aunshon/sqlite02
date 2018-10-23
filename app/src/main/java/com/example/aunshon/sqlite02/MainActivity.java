package com.example.aunshon.sqlite02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    EditText name,surname,marks;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        surname=findViewById(R.id.surname);
        marks=findViewById(R.id.marks);

        databaseHelper =new DatabaseHelper(MainActivity.this);
    }

    public void AddData(View view) {
        Boolean isInsetted=databaseHelper.InsertData(name.getText().toString(),surname.getText().toString(),marks.getText().toString());
        if (isInsetted.equals(true)){
            Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Not Insetted", Toast.LENGTH_SHORT).show();
        }
    }
}
