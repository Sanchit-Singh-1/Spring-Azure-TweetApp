package com.tweetapp.service;

import com.tweetapp.request.TweetRequest;
import com.tweetapp.response.TweetResponse;
import org.springframework.stereotype.Service;

@Service
public interface TweetsService {

	TweetResponse getAllTweets();

	TweetResponse getAllTweetsByUserName(String userName);

	TweetResponse addTweet(TweetRequest request, String userName);

	TweetResponse deleteTweet(String userName, Long tweetId);

	TweetResponse replyToTweet(TweetRequest request);

	TweetResponse likeATweet(TweetRequest request);

	TweetResponse updateTweet(TweetRequest request);

}
