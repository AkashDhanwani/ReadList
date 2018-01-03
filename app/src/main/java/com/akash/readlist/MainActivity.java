package com.akash.readlist;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvRead;

    Uri CONTENT_URI = Uri.parse("content://listprovider/list");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRead = findViewById(R.id.tvRead);

        ContentResolver contentResolver = getContentResolver();

        String disp =  contentResolver.getType(CONTENT_URI);

        tvRead.setText(disp);
    }
}
