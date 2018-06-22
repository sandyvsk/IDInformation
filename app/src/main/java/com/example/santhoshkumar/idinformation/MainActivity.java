package com.example.santhoshkumar.idinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etID;
    TextView tvMessage;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etID=(EditText) findViewById(R.id.etID);
        tvMessage=(TextView) findViewById(R.id.tvMessage);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String data = etID.getText().toString();

        String DOB = data.substring(0,6);

        int gender = Integer.parseInt(data.charAt(6)+"");

        String sGender;

        if(gender>=5)
            sGender="Male";
        else
            sGender="Female";

        int nationality = Integer.parseInt(data.charAt(10)+"");

        String sNationality;

        if (nationality==0)
            sNationality="Indian";
        else
            sNationality="Other Country";

        tvMessage.setText("Your Information: \n" +
                            "DOB:" +DOB + "\n" +
                            "Gender:" +sGender + "\n" +
                            "Nationality" +sNationality);

    }
}
