package com.example.applauncher;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
 TextView kowt;
 Button bowton;
    ArrayList<String> kots;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top,
                    systemBars.right, systemBars.bottom);
            return insets;


        });

        kowt = findViewById(R.id.textView);
        bowton = findViewById(R.id.button);
      kots = new ArrayList<>();
                kots.add("Iniwan ka na nga, hahabulin mo pa? Gusto mo ng Gold Medal?");
                kots.add("Hindi ka naman 'flower', pero bakit 'blooming' ka sa pagiging plastic?");
                kots.add("Akala mo kung sino, mukha namang 'yung 'bad story' sa storya ko.");
                kots.add("Mabuti pa ang mabagal, kung sigurado.");
                kots.add("Magbiro ka na sa lasing, huwag lang sa bagong gising.");
                kots.add("Ang pag-ibig parang holdapan, nasa sa'yo kung makikipagpatayan ka.");
                kots.add("Pampers ka ba? Kasi 'di ka marunong mag-leak ng sikreto.");
                kots.add("Magbiro ka na sa lasing, wag lang sa taong may tuliling.");
                kots.add("Ang pag-ibig ko sayo parang Utot. Pinipigilan pero pumuputok.");
                kots.add("Ang buhay ay parang blog, scroll down lang nang scroll down.")
        };
        bowton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        }

                kowt.setText(String.(index));
                index++;

                if (index == kots.size()) {
                    bowton.setEnabled(false);
                   bowton.setText("Done");
                }
    }
}

