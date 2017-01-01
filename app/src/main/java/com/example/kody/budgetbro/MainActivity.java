package com.example.kody.budgetbro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Add Transaction button */
    public void addTransaction(View view) {
        Intent intent = new Intent(this, DisplayNewTransaction.class);
        //LinearLayout addTrans =  (LinearLayout) findViewById(R.id.add_transaction);
        startActivity(intent);
    }




}
