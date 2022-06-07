package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private final  List<String> mensajes = Arrays.asList(
            "Buenas",
            "oid",
            "trikitracatelas"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView = findviewById(R.id.MSJ);
        mButton = findviewById(R.id.mButton);

        mTextView.setText(mensaje.get(1)
        );
    }
}