/*
 * Class Name: Tweet
 *
 * Version: 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team 3. CMPUT301. University of Alberta. All Rights Reserved. You may use, distribute or modify the code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Di Zhang
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }


    /**
     * Constructs Tweet Object
     *
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Sets tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */


    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Getter for message
     *
     * @return
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Getter for date
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for date
     *
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Convert date to string object
     *
     * @return
     */

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
