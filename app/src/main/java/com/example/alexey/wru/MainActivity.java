package com.example.alexey.wru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView serverMessage;
    Button toTheServerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serverMessage = (TextView) findViewById(R.id.serverMessage);
        toTheServerButton = (Button) findViewById(R.id.toTheServerButton);
    }

    public void onClick(View view) {
        if(view.equals(toTheServerButton)) {
            SocketConnect socketConnect = new SocketConnect("1234567890gmd?\n", 4001);
            socketConnect.execute("simply.su");
            while(!socketConnect.isMessageIsCatch()) {
                //в идеале тут нужно показывать анимацию загрузки, пока такие штуки вообще существуют
            }
            serverMessage.setText(socketConnect.getServerMessage());
        }
    }
}

