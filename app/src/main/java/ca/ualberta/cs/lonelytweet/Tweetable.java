package ca.ualberta.cs.lonelytweet;


import java.util.Date;

public interface Tweetable {

    //fixed warning: "modifier 'punblic' is redundant by for interface method" by delete visibility
    String getMessage();

    Date getDate();

}
