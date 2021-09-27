package com.company;

public class Follower implements Observer {
    private String name;
    private Subject channel = new Channel();

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("There is a new video for you, "+ name );
    }

    @Override
    public void followChannel(Subject ch) {

        channel = ch;
    }



}
