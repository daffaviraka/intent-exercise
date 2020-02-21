package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

import id.ac.polinema.intentexercise.model.UserModel;

public class RegisterActivity extends AppCompatActivity {

    public static String USER_KEY = "user";

    private TextInputEditText fullnameInput;
    private TextInputEditText emailInput;
    private TextInputEditText passwordInput;
    private TextInputEditText homepageInput;
    private TextInputEditText aboutInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //bind
        fullnameInput = findViewById(R.id.text_fullname);
        emailInput = findViewById(R.id.text_email);
        passwordInput = findViewById(R.id.text_password);
        homepageInput = findViewById(R.id.text_homepage);
        aboutInput = findViewById(R.id.text_about);

    }

    public void handleSubmit(View view){
        String fullname = fullnameInput.getText().toString();
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();
        String homepage = homepageInput.getText().toString();
        String about = aboutInput.getText().toString();

        Intent intent = new Intent(this,ProfileActivity.class);

        intent.putExtra(USER_KEY, new UserModel(fullname,email,password,homepage,about));

        startActivity(intent);

    }
}
