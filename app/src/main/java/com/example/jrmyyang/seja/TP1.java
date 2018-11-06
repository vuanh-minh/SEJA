package com.example.jrmyyang.seja;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hugo.weaving.DebugLog;

public class TP1 extends AppCompatActivity implements Observer {

    @BindView(R.id.phone_number)
    EditText phone_number; //numero de tel
    @BindView(R.id.result)
    TextView result; //resultat
    @BindView(R.id.input)
    EditText input; //Entree clavier
    @BindView(R.id.empiler)
    Button empiler; //bouton empiler
    @BindView(R.id.plus)
    Button plus; //bouton plus
    @BindView(R.id.moins)
    Button moins; //bouton moins
    @BindView(R.id.mult)
    Button mult; //bouton mult
    @BindView(R.id.div)
    Button div; //bouton div
    @BindView(R.id.clear)
    Button clear; //bouton clear
    @BindView(R.id.progress)
    ProgressBar progress;

    String phoneNo;
    Calculette Calc = new Calculette();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp1);

        Calc.addObserver(this);
        ButterKnife.bind(this);
        //result.setText(Calc.toString());
        progress.setMax(Calc.capacity());
    }

    @OnClick(R.id.empiler)
    @DebugLog
    public void empile() {

        if (input.getText().toString().matches("")) {
            sendSMS("Veuillez entrer un nombre valide :)");
            return;
        }
        try {
            Calc.enter(Integer.parseInt(input.getText().toString()));
        } catch (CalculetteException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.plus)
    @DebugLog
    public void add() {
        try {
            Calc.add();
        } catch (CalculetteException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.moins)
    @DebugLog
    public void sub() {
        try {
            Calc.sub();
        } catch (CalculetteException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.mult)
    @DebugLog
    public void multiplier() {
        try {
            Calc.mul();
        } catch (CalculetteException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.div)
    @DebugLog
    public void diviser() {
        try {
            Calc.div();
        } catch (CalculetteException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.clear)
    @DebugLog
    public void clear() {
        Calc.clear();
    }

    @Override
    public void update(Observable o, Object arg) {
        result.setText(Calc.toString());
        progress.setProgress(Calc.size());
        input.setText("");

        //actualiserInterface();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        int taille = Calc.size();
        savedInstanceState.putInt("taille", taille);
        for (Integer i = 0; i < taille; i++) {
            try {
                savedInstanceState.putInt(i.toString(), Calc.pop());
            } catch (CalculetteException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int taille = savedInstanceState.getInt("taille");

        for (Integer i = taille - 1; i >= 0; i--) {
            try {
                Calc.enter(savedInstanceState.getInt(i.toString()));
            } catch (CalculetteException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendSMS(String msg) {
        try {

                phoneNo = phone_number.getText().toString();

                Toast.makeText(getBaseContext(), "Number : " + phoneNo, Toast.LENGTH_LONG).show();

                SmsManager sm = SmsManager.getDefault();
                String body = getString(R.string.app_name) + ": " + msg + "\n";
                sm.sendTextMessage(phoneNo, null, body, null, null);

                Toast.makeText(getBaseContext(), "SMS sent : " + phoneNo, Toast.LENGTH_LONG).show();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
