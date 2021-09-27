package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String title;
    List<Follower> subs = new ArrayList<>();

    @Override
    public void follow(Follower sub) {
        subs.add(sub);
    }

    @Override
    public void unFollow(Observer sub)
    {
        subs.remove(sub);
    }

    @Override
    public void notifySubscriber() {
        for(Observer sub: subs) {
            sub.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }

}
