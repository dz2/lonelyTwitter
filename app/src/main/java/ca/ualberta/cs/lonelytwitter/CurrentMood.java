package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ggranked on 2017-09-15.
 */

public abstract class CurrentMood implements Moodable{
    private String mood;
    private Date date;

    public CurrentMood(String mood){
        this.mood = mood;    //'this' is a key word
        this.date = new Date();

    }

    public CurrentMood(String mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void setMessage(String mood){
            this.mood = mood;
        }


    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return mood;
    }

    public abstract Boolean isVital();
}
