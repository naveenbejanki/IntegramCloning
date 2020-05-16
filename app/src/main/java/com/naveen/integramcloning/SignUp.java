package com.naveen.integramcloning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    private TextView kickboxerName,punchpower,punchspeed,kickpower,kickspeed;

    private Button btnsumited;
    @Override0
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         kickboxerName=findViewById(R.id.editnamekickboxer);
         punchpower=findViewById(R.id.editpunchpower);
         punchspeed=findViewById(R.id.editpunchspedd);
         kickpower=findViewById(R.id.editkickpower);
         kickspeed=findViewById(R.id.editkickspeed);
         btnsumited=findViewById(R.id.buttonsubmit);


         btnsumited.setOnClickListener(SignUp.this);

    }

    @Override
    public void onClick(View v) {
        try {
            final ParseObject kickboxer = new ParseObject("KIckboxer");
            kickboxer.put("Name", kickboxerName.getText().toString());
            kickboxer.put("punchpower", Integer.parseInt(punchpower.getText().toString()));
            kickboxer.put("punchspeed", Integer.parseInt(punchspeed.getText().toString()));
            kickboxer.put("kicpower", Integer.parseInt(kickpower.getText().toString()));
            kickboxer.put("kickspeed", Integer.parseInt(kickspeed.getText().toString()));
            kickboxer.saveEventually(new SaveCallback() {
                @Override
                public void done(ParseException e) {
                    if (e == null) {

                        FancyToast.makeText(SignUp.this, kickboxer.get("Name") + "sava to succeefull", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, true).show();
                    } else {

                        FancyToast.makeText(SignUp.this, e.getMessage(), FancyToast.LENGTH_LONG, FancyToast.ERROR, true).show();
                    }
                }
            });
        }catch (Exception e){
            FancyToast.makeText(SignUp.this, e.getMessage(), FancyToast.LENGTH_LONG, FancyToast.ERROR, true).show();

        }
    }
}
