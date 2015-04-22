package com.example.andremiranda.messingaround;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button answerYesButton, answerNoButton;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerYesButton = (Button) findViewById(R.id.answer_yes_button);
        answerNoButton = (Button) findViewById(R.id.answer_no_button);
        usersNameEditText = (EditText) findViewById(R.id.users_name_edit_text);
    }

    public void onYesButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());

        String yesReponse = "That's greate! " + usersName;

        Toast.makeText(this, yesReponse, Toast.LENGTH_SHORT).show();

    }

    public void onNoButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());

        String noResponse = "That's not greate! " + usersName;

        Toast.makeText(this, noResponse, Toast.LENGTH_LONG).show();
    }
}
