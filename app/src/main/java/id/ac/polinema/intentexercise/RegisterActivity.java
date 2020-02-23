package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.Domain;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;

import id.ac.polinema.intentexercise.model.UserModel;

public class RegisterActivity extends AppCompatActivity {

    public static String USER_KEY = "user";

    @NotEmpty
    private TextInputEditText fullnameInput;
    @Email
    private TextInputEditText emailInput;
    @Password
    private TextInputEditText passwordInput;
    @ConfirmPassword
    private TextInputEditText confirmPasswordInput;
    @Domain
    private TextInputEditText homepageInput;
    private TextInputEditText aboutInput;
    private ImageView imageProfile;
    Validator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //bind
        fullnameInput = findViewById(R.id.text_fullname);
        emailInput = findViewById(R.id.text_email);
        passwordInput = findViewById(R.id.text_password);
        confirmPasswordInput = findViewById(R.id.text_confirm_password);
        homepageInput = findViewById(R.id.text_homepage);
        aboutInput = findViewById(R.id.text_about);
        imageProfile= findViewById(R.id.image_profile);

    }

    public void handleSubmit(View view){
        String fullname = fullnameInput.getText().toString();
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();
        String confirmPassword = confirmPasswordInput.getText().toString();
        String homepage = homepageInput.getText().toString();
        String about = aboutInput.getText().toString();


        Intent intent = new Intent(this,ProfileActivity.class);

        intent.putExtra(USER_KEY, new UserModel(fullname,email,password,homepage,about));

        startActivity(intent);

    }
}
