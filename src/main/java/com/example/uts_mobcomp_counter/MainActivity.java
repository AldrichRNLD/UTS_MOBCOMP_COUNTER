package com.example.uts_mobcomp_counter;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static com.example.uts_mobcomp_counter.R.id.*;

public class MainActivity extends AppCompatActivity {
    private TextView counterTxt;
    private Button minusBtn;
    private Button plusBtn;
    private Button resetBtn;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.minusBtn:
                    minusCounter();
                    break;
                case R.id.plusBtn:
                    plusCounter();
                    break;
                case R.id.resetBtn:
                    initCounter();
                    break;

            }

        }
    };
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(clickListener);
        plusBtn = (Button) findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(clickListener);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(clickListener);

        initCounter();

    }

    private void initCounter() {
        counter = 0;
        counterTxt.setText(counter + "");
    }

    private void plusCounter() {
        counter++;
        counterTxt.setText(counter + "");
    }

    private void minusCounter() {
        counter--;
        counterTxt.setText(counter + "");
    }
}