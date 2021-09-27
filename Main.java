package com.company;

public class Main {

    public static void main(String[] args) {
        Follower s1 = new Follower("Simple");
        Follower s2 = new Follower("Boomi4");


        Subject Blast = new Channel();

        Blast.follow(s1);
        Blast.follow(s2);
       Blast.unFollow(s1);
        s1.followChannel(Blast);
        s2.followChannel(Blast);

        Blast.upload("New blast match Navi vs Forze!");

    }
    }

