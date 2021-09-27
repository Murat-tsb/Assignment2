package com.company;

public interface Observer {
    void update();

    void followChannel(Subject ch);
}
