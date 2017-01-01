package com.example.kody.budgetbro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


/**
 * Created by Kody on 31/12/2016.
 */

public class DisplayNewTransaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_transaction);

        ((RadioGroup) findViewById(R.id.toggleGroup)).setOnCheckedChangeListener(ToggleListener);
        Intent intent = getIntent();
    }

    static final RadioGroup.OnCheckedChangeListener ToggleListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(final RadioGroup radioGroup, final int i) {
            for (int j = 0; j < radioGroup.getChildCount(); j++) {
                final ToggleButton view = (ToggleButton) radioGroup.getChildAt(j);
                view.setChecked(view.getId() == i);
            }
        }


    };

    public void onToggle(View view) {
        ((RadioGroup)view.getParent()).check(view.getId());
        // app specific stuff ..
    }
}
