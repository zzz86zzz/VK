package ru.netology.domain;

public class Post {
    private int id;
    private  int date;
    private int ownerId;
    private  String text;
    private int replyOwnerId;
    private int replyPostId;
    private int onlyFriends;
    private String copyrigth;

    private boolean canDelete ;
    private boolean canCopy;
    private boolean canEdit;

    private CommentsInfo commentsInfo;
    private LikesInfo like;
    private Repost repost;
    private Geo geo;
    private User user;

}
