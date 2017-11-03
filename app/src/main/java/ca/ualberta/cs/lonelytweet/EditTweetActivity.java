package ca.ualberta.cs.lonelytweet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import ca.ualberta.cs.lonelytwitter.R;

public class EditTweetActivity extends Activity {
    //private TextView nameE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView nameE;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        nameE = (TextView) findViewById((R.id.editTweet));

        Intent i = getIntent();
        String name = i.getStringExtra("editTweet");
        nameE.setText(name);
    }
}
