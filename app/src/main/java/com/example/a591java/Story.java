package com.example.a591java;

public class Story {
    String taggedComment;
    int profile;
    String fullname;
    String story_comment_1_id;
    String story_comment_2_id;
    int story_fullImageScreen_id;

    public Story(String taggedComment, int profile, String fullname, String story_comment_1_id, String story_comment_2_id, int story_fullImageScreen_id) {
        this.taggedComment = taggedComment;
        this.profile = profile;
        this.fullname = fullname;
        this.story_comment_1_id = story_comment_1_id;
        this.story_comment_2_id = story_comment_2_id;
        this.story_fullImageScreen_id = story_fullImageScreen_id;
    }
}
