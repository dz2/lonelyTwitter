package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {
    private TextView nameE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        nameE = (TextView) findViewById((R.id.editTweet));

        Intent i = getIntent();
        String name = i.getStringExtra("editTweet");
        nameE.setText(name);
    }
}
