package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by dz2 on 10/12/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count = 0;

    public TweetList(){

    }
    public void add(Tweet tweet){
        tweets.add(tweet);

    }
    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);

    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);

    }

    public Tweet getTweet(int index){
        return tweets.get(index);

    }

    public int countTweet(){
        for (;count <= tweets.size() -1 ; count++) {
        }
        return count;
    }

}
