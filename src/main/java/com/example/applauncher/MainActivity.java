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
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtQoute;
    Button nxtbtn;
    ArrayList<String> quotes = new ArrayList<>();
    Random random = new Random();
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            txtQoute = findViewById(R.id.txtQoute);
            nxtbtn = findViewById(R.id.nxtbtn);


            quotes.add("Iniwan ka na nga, hahabulin mo pa? Gusto mo ng Gold Medal?");
            quotes.add("Hindi ka naman 'flower', pero bakit 'blooming' ka sa pagiging plastic?");
            quotes.add("Akala mo kung sino, mukha namang 'yung 'bad story' sa storya ko.");
            quotes.add("Mabuti pa ang mabagal, kung sigurado.");
            quotes.add("Magbiro ka na sa lasing, huwag lang sa bagong gising.");
            quotes.add("Ang pag-ibig parang holdapan, nasa sa'yo kung makikipagpatayan ka.");
            quotes.add("Pampers ka ba? Kasi 'di ka marunong mag-leak ng sikreto.");
            quotes.add("Magbiro ka na sa lasing, wag lang sa taong may tuliling.");
            quotes.add("Ang pag-ibig ko sayo parang Utot. Pinipigilan pero pumuputok.");
            quotes.add("Ang buhay ay parang blog, scroll down lang nang scroll down.");

            nxtbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (count < quotes.size()) {
                        int index = random.nextInt(quotes.size());
                        txtQoute.setText(quotes.get(index));
                        quotes.remove(index);
                        count++;
                    }

                    // BONUS: disable button after all quotes shown
                    if (count == 10) {
                        nxtbtn.setEnabled(false);
                        nxtbtn.setText("DONE");
                    }
                }
            });
            return insets;
        });
    ;}
}
