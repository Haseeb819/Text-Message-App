package com.haseeb.msgapp;

/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SMS();

    }
    Button btn;
    EditText phone, msg;
    public void SMS() {

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phone = findViewById(R.id.phone_number);
                msg = findViewById(R.id.message);
                String ph = phone.getText().toString();
                String sms = msg.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(String.valueOf(phone), ph, sms, null, null);
                Toast.makeText(getApplicationContext(), "Message send Hopefully",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SMS();
    }

    private void SMS() {
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText phone=findViewById(R.id.phone_number);
                EditText message=findViewById(R.id.message);

                String ph=phone.getText().toString();
                String sms=message.getText().toString();

                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(ph, null,sms,null,null);

            }
        });
    }
}