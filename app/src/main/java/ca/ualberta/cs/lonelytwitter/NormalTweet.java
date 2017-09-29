/*
 * Class Name: NormalTweet
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
 * Represents a Normal Tweet
 *
 * @author Di Zhang
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet {
    /**
     * Constructs Normal Tweet Object
     *
     * @param message
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs Normal Tweet Object with date
     *
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Validate normal tweet
     *
     * @return
     */

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
