/*
 * Class Name: LonelyTwitterActivityTest
 *
 * Version: 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team 3. CMPUT301. University of Alberta. All Rights Reserved. You may use, distribute or modify the code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Represents a Normal Tweet
 *
 * @author Di Zhang
 * @version 1.0
 * @see ActivityInstrumentationTestCase2
 * @since 1.0
 */

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {
    /**
     * Start the main activity
     */
    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Handles possible error starting the main activity
     *
     * @throws Exception
     */
    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
}