package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user = new User("Elgin Loh", "Hi i am currently from IT Year 2 and i love playing games and used to be in E-sports for mobile legends", 0, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView DisplayDesc = (TextView) findViewById((R.id.displayDesc));
        TextView DisplayName = (TextView) findViewById(R.id.displayName);
        DisplayName.setText(user.name);
        DisplayDesc.setText(user.description);
        Button button = (Button) findViewById(R.id.follow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == false) {
                    user.setFollowed(true);
                    button.setText("Unfollow");
                } else {
                    user.setFollowed(false);
                    button.setText("Follow");
                }
            }

        });
    }
}