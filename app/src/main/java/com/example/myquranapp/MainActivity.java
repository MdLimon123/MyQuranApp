package com.example.myquranapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView pdflistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdflistview = findViewById(R.id.Surah_names);

        String[] pdfFilenames = {"Surah Fatiha","Surah Baqarah","Surah Al Imran",
                "Surah Nisa","Surah Maidah", "Surah Anam","Surah Araf",
                "Sruah Anfal","Surah Taubah","Surah Yunus","Surah Hud",
                "Surah Yusuf","Surha Ar Red",   "Surah Ibrahim",
                "Surah Hijr","Surah Nahl", "Surah Isra", "Surah Kahf", "Surah Maryam",
                "Surha Taha","Surha Anbiya","Surah Hajj","Surah Muminun",  "Surah Noor",
                "Surah Yaseen","Surah Furqan " ,
                "Surah Muhammad","Surah Rahman", "Surah Waqiah", "Surah Mulk", "Surah Muzammil"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFilenames)
        {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = view.findViewById(android.R.id.text1);

                return view ;

            }
        };
        pdflistview.setAdapter(adapter);

        pdflistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = pdflistview.getItemAtPosition(position).toString();

                Intent intent = new Intent(getApplicationContext(),PdfOpener.class);
                intent.putExtra("filename", item);
                startActivity(intent);
            }
        });
    }
}