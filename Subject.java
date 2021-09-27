package com.company;

public interface Subject {

    void follow(Follower sub);

    void unFollow(Observer sub);

    void notifySubscriber();

    void upload(String title);
}
