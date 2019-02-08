package com.example.latihanscrollview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtIG, txtGit, txtkebijakan, txtteman, txtberi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar ab = getSupportActionBar();
        ab.hide();

        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txtIG = findViewById(R.id.txtIG);
        txtIG.setOnClickListener(this);

        txtGit = findViewById(R.id.txtGit);
        txtGit.setOnClickListener(this);

        txtkebijakan = findViewById(R.id.txtkebijakan);
        txtkebijakan.setOnClickListener(this);

        txtteman = findViewById(R.id.txtteman);
        txtteman.setOnClickListener(this);

        txtberi = findViewById(R.id.txtberi);
        txtberi.setOnClickListener(this);
    }

    private void IG() {startActivity(new Intent(getApplicationContext(),Bebas.class));}

    public void onClick(View v){
        if(v == txtIG){
            IG();
        }else if(v == txtGit){
            IG();
        }else if(v == txtberi){
            IG();
        }else if(v == txtteman){
            IG();
        }else if(v == txtkebijakan){
            IG();
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Yakin Ingin Keluar Aplikasi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}