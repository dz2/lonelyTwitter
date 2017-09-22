package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by dz2 on 9/14/17.
 */

public abstract class Tweet implements Tweetable {   //class should start with a capital letter, variable is not
    private String message;
    private Date date;
    //int i; (can be accessed by package)

    public Tweet(String message){
        this.message = message;    //'this' is a key word
        this.date = new Date();

    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    public abstract Boolean isImportant();

}
