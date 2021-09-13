package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfOpener extends AppCompatActivity {

    PDFView mypdfview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_opener);

        mypdfview = findViewById(R.id.opener);

        String getitem = getIntent().getStringExtra("filename");

        if (getitem.equals("Surah Al Imran")){

            mypdfview.fromAsset("Surah-Al-Imran.pdf").load();
        }
        else if (getitem.equals("Surah Anam")){

            mypdfview.fromAsset("Surah-Anam.pdf").load();
        }
        else if (getitem.equals("Surha Anbiya")){

            mypdfview.fromAsset("Surah-Anbiya.pdf").load();
        }
        else if (getitem.equals("Sruah Anfal")){

            mypdfview.fromAsset("Surah-Anfal.pdf").load();
        }
        else if (getitem.equals("Surha Ar Red")){

            mypdfview.fromAsset("Surah-Ar-Rad.pdf").load();
        }
        else if (getitem.equals("Surah Araf")){

            mypdfview.fromAsset("Surah-Araf.pdf").load();
        }
        else if (getitem.equals("Surah Baqarah")){

            mypdfview.fromAsset("Surah-Baqarah.pdf").load();
        }
        else if (getitem.equals("Surah Fatiha")){

            mypdfview.fromAsset("Surah-Fatiha.pdf").load();
        }
        else if (getitem.equals("Surah Furqan")){

            mypdfview.fromAsset("Surah-Furqan.pdf").load();
        }
        else if (getitem.equals("Surah Hajj")){

            mypdfview.fromAsset("Surah-Hajj.pdf").load();
        }
        else if (getitem.equals("Surah Hijr")){

            mypdfview.fromAsset("Surah-Hijr.pdf").load();
        }
        else if (getitem.equals("Surah Hud")){

            mypdfview.fromAsset("Surah-Hud.pdf").load();
        }
        else if (getitem.equals("Surah Ibrahim")){

            mypdfview.fromAsset("Surah-Ibrahim.pdf").load();
        }
        else if (getitem.equals("Surah Isra")){

            mypdfview.fromAsset("Surah-Isra.pdf").load();
        }

        else if (getitem.equals("Surah Kahf")){

            mypdfview.fromAsset("Surah-Kahf.pdf").load();
        }
        else if (getitem.equals("Surah Maidah")){

            mypdfview.fromAsset("Surah-Maidah.pdf").load();
        }
        else if (getitem.equals("Surah Maryam")){

            mypdfview.fromAsset("Surah-Maryam.pdff").load();
        }
        else if (getitem.equals("Surah Muhammad")){

            mypdfview.fromAsset("Surah-Muhammad.pdf").load();
        }
        else if (getitem.equals("Surah Mulk")){

            mypdfview.fromAsset("Surah-Mulk.pdf").load();
        }
        else if (getitem.equals("Surah Muminun")){

            mypdfview.fromAsset("Surah-Muminun.pdf").load();
        }
        else if (getitem.equals("Surah Muzammil")){

            mypdfview.fromAsset("Surah-Muzammil.pdf").load();
        }
        else if (getitem.equals("Surah Nahl")){

            mypdfview.fromAsset("Surah-Nahl.pdf").load();
        }
        else if (getitem.equals("Surah Nisa")){

            mypdfview.fromAsset("Surah-Nisac.pdf").load();
        }
        else if (getitem.equals("Surah Noor")){

            mypdfview.fromAsset("Surah-Noor.pdf").load();
        }
        else if (getitem.equals("Surah Rahman")){

            mypdfview.fromAsset("Surah-Rahman.pdf").load();
        }
        else if (getitem.equals("Surha Taha")){

            mypdfview.fromAsset("Surah-Taha.pdf").load();
        }
        else if (getitem.equals("Surah Taubah")){

            mypdfview.fromAsset("Surah-Taubah.pdf").load();
        }
        else if (getitem.equals("Surah Waqiah")){

            mypdfview.fromAsset("Surah-Waqiah.pdf").load();
        }
        else if (getitem.equals("Surah Yaseen")){

            mypdfview.fromAsset("Surah-Yaseen.pdf").load();
        }
        else if (getitem.equals("Surah Yunus")){

            mypdfview.fromAsset("Surah-Yunus.pdf").load();
        }
        else if (getitem.equals("Surah Yusuf")){

            mypdfview.fromAsset("Surah-Yusuf.pdf").load();
        }



    }
}