package com.example.question3oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Trapezium = findViewById(R.id.Trapezium);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an instance of Trapezium
        Trapezium trapezium = new Trapezium(10, 8, 6);

        // Calculate the area
        double area = trapezium.calculateArea();

        // Display the area in a TextView

        Trapezium.setText("Area of the trapezium: " + area);

    }

}


class Trapezium {
    private double base1;
    private double base2;
    private double height;

    public Trapezium(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double calculateArea() {
        return ( 0.5 * (base1 + base2) * height );
    }
}

