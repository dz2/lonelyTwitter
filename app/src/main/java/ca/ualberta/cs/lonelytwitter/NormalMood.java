package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ggranked on 2017-09-15.
 */

public class NormalMood extends CurrentMood {
    public NormalMood(String mood) {
        super(mood);
    }

    public NormalMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isVital() {
        return Boolean.FALSE;
    }
}
