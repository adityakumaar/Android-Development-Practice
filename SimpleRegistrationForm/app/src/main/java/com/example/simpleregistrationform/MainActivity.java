package com.example.simpleregistrationform;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    EditText studentName, courseName, address, contactNumber, email;
    private EditText passwordMain, confirmPassword;
    RadioButton radio;
    CheckBox checkboxSports, checkboxMusic;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =           (Button)findViewById(R.id.button1);
        button2 =           (Button)findViewById(R.id.button2);
        studentName =       (EditText)findViewById(R.id.studentName);
        courseName =        (EditText)findViewById(R.id.courseName);
        address =           (EditText)findViewById(R.id.address);
        contactNumber =     (EditText)findViewById(R.id.contactNumber);
        email =             (EditText)findViewById(R.id.email);
        passwordMain =      (EditText)findViewById(R.id.passwordMain);
        confirmPassword =   (EditText)findViewById(R.id.confirmPassword);
        radio =             (RadioButton)findViewById(R.id.radio);
        //radioMale =       (RadioButton)findViewById(R.id.radioMale);
        checkboxSports =    (CheckBox)findViewById(R.id.checkboxSports);
        checkboxMusic =     (CheckBox)findViewById(R.id.checkboxMusic);

        //submit button toast
        button1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Details Submitted", Toast.LENGTH_SHORT).show();
            }
        });

        //clear button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Details Cleared", Toast.LENGTH_SHORT).show();
                studentName.getText().clear();
                courseName.getText().clear();
                address.getText().clear();
                contactNumber.getText().clear();
                email.getText().clear();
                passwordMain.getText().clear();
                confirmPassword.getText().clear();
                //radioMale.setChecked(false);
                radio.setChecked(false);
                checkboxMusic.setChecked(false);
                checkboxSports.setChecked(false);
            }
        });
    }
}