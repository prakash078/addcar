package com.example.caradder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText carname, year,colour, price, eng;
    TextView textView;
    Button button;
    Model model=new Model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carname =findViewById(R.id.edittextname);
        year =findViewById(R.id.edittextyear);
        colour=findViewById(R.id.edittextcolor);
        price =findViewById(R.id.edittextprice);
        eng =findViewById(R.id.edittextengine);
        textView =findViewById(R.id.output);
        button =findViewById(R.id.button);

        model.setName(carname.getText().toString());
        model.setYear(year.getText().toString());
        model.setColor(colour.getText().toString());
        model.setPrice(price.getText().toString());
        model.setEngine(eng.getText().toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    textView.append("Car Name: " + carname.getText().toString() + "\n");
                    textView.append("Manufactured Year: " + year.getText().toString() + "\n");
                    textView.append("Colour: " + colour.getText().toString() + "\n");
                    textView.append("Purchased Price (Rs.): " + price.getText().toString() + "\n");
                    textView.append("Engine Size (Ltrs.): " + eng.getText().toString() + "\n");

            }
        });
    }
}
