/*
 * Class Name: ImportantTweet
 *
 * Version: 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team 4. CMPUT301. University of Alberta. All Rights Reserved. You may use, distribute or modify the code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Represents an Important Tweet
 *
 * @author Di Zhang
 * @version 1.0
 * @see Tweet
 * @see Tweetable
 * @since 1.0
 */

public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs Important Tweet Object with date
     *
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs Important Tweet Object with date
     *
     * @param message
     * @param date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Validate important tweet
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
