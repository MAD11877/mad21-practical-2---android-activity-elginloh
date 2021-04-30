package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User user = new User("Elgin Loh", "Hi i am currently from IT Year 2 and i love playing games and used to be in E-sports for mobile legends", 0, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView DisplayDesc = (TextView) findViewById((R.id.DisplayDesc));
        TextView DisplayName = (TextView) findViewById(R.id.DisplayName);
        DisplayName.setText(user.name);
        DisplayDesc.setText(user.description);
        Button button = (Button) findViewById(R.id.follow);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.followed == false)
                {
                    user.setFollowed(true);
                    button.setText("Unfollow");
                }
                else
                {
                    user.setFollowed(false);
                    button.setText("Follow");
                }
            }

        });
    }







}