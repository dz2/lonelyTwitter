package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ggranked on 2017-09-15.
 */

public class VitalMood extends CurrentMood {
    public VitalMood(String mood){
        super(mood);
    }

    public VitalMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isVital() {
        return Boolean.TRUE;
    }

}
