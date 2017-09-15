package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dz2 on 9/14/17.
 */

public class ImportantTweet extends Tweet{       //just for one class

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
