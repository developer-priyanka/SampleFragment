package my.assignment.samplefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v4.app.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submitbtn;
    EditText edText;
    Fragment f1;
    SimpleAddition additionfrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edText=(EditText)findViewById(R.id.editText);
        submitbtn=(Button)findViewById(R.id.button);
        additionfrg= new SimpleAddition();
        FragmentManager fm =getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.fragment_container,additionfrg);
        ft.commit();
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                additionfrg.updateDisplay(edText.getText().toString());
            }
        });



    }


}
