package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intentexercise.model.UserModel;

public class ProfileActivity extends AppCompatActivity {

    private TextView fullnameText;
    private TextView emailText;
    private TextView passwordText;
    private TextView homepageText;
    private TextView aboutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // TODO: bind here
        fullnameText = findViewById(R.id.text_fullname);
        emailText = findViewById(R.id.text_email);
        passwordText = findViewById(R.id.text_password);
        homepageText = findViewById(R.id.text_homepage);
        aboutText = findViewById(R.id.text_about);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            UserModel user = extras.getParcelable(RegisterActivity.USER_KEY);

            fullnameText.setText(user.getFullname());
            emailText.setText(user.getEmail());
            passwordText.setText(user.getPassword());
            homepageText.setText(user.getHomepage());
            aboutText.setText(user.getAbout());

        }
    }
}
